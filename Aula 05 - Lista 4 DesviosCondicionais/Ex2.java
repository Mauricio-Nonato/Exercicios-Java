/*
 * Q2 CÁLCULO DINHEIRO PARA VIAGEM – Crie um programa para calcular várias
 * informações financeiras de um grupo de 4 amigos brasileiros que deseja
 * viajar para um intercambio, o programa deverá solicitar: 
 * a) Cotação diária das seguintes moedas, Dólar, Euro e Libra Esterlina;
 * b) O primeiro Nome (estude como armazenar nomes na linguagem 
 * C) e quantidade de Reais que cada um dos 4 amigos deseja levar. Após informar 
 * todos os dados, o programa deverá exibir os seguintes resultados: 
 * a) Deverá exibir a soma total juntando todos os valores em reais dos amigos. 
 * b) Deverá exibir o nome e valor do amigo que contiver a maior quantidade de reais. 
 * c) Deverá exibir o nome e valor do amigo que contiver a menor quantidade de reais. 
 * d) Deverá exibir o nome de cada um dos amigos e a quantidade de dinheiro que cada
 * um terá para gastar na viagem já convertida em cada das moedas
 * (aplique o valor das cotações), a mensagem deverá ser algo como “Joao tem X reais,
 * convertidos terá Y dólares, Z euros e W libras.” 
 * e) Deverá exibir também os valores ordenados em reais do menor para o maior.
 */
import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] cotacoes = new double[3];
        String[] moedas = {"Dólar", "Euro", "Libra"};
        String[] nomes = new String[4];
        double[] valores = new double[4];

        // Cotações
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a cotação do " + moedas[i] + ": ");
            cotacoes[i] = sc.nextDouble();
        }

        sc.nextLine(); // Limpar buffer

        // Dados dos amigos
        for (int i = 0; i < 4; i++) {
            System.out.print("\nNome do amigo " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            System.out.print("Quantidade em reais que deseja levar: ");
            valores[i] = sc.nextDouble();
            sc.nextLine(); // Limpar buffer
        }

        // a) Soma total
        double somaTotal = 0;
        for (double v : valores) {
            somaTotal += v;
        }

        // b/c) Maior e menor
        double maior = valores[0], menor = valores[0];
        String nomeMaior = nomes[0], nomeMenor = nomes[0];
        for (int i = 1; i < 4; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
                nomeMaior = nomes[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
                nomeMenor = nomes[i];
            }
        }

        System.out.printf("\nSoma total em reais: %.2f\n", somaTotal);
        System.out.printf("Maior valor: %s com %.2f reais\n", nomeMaior, maior);
        System.out.printf("Menor valor: %s com %.2f reais\n", nomeMenor, menor);

        // d) Conversão
        System.out.println("\nConversões por pessoa:");
        for (int i = 0; i < 4; i++) {
            double dolar = valores[i] / cotacoes[0];
            double euro = valores[i] / cotacoes[1];
            double libra = valores[i] / cotacoes[2];
            System.out.printf("%s tem %.2f reais, convertidos terá %.2f dólares, %.2f euros e %.2f libras.\n",
                    nomes[i], valores[i], dolar, euro, libra);
        }

        // e) Ordenar valores
        Double[] valoresOrdenados = Arrays.stream(valores).boxed().toArray(Double[]::new);
        Arrays.sort(valoresOrdenados);

        System.out.println("\nValores em reais ordenados (menor -> maior):");
        for (double v : valoresOrdenados) {
            System.out.printf("%.2f\n", v);
        }

        sc.close();
    }
}
