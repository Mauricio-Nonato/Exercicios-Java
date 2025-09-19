/*
 * Q1 FIGURAS GEOMÉTRICAS – Crie um programa que seja capaz de calcular a área de 4 figuras
 * geométricas, são elas, retângulo, triângulo, quadrado e círculo, todas as informações de
 * dimensões das figuras devem ser fornecidas pelo usuário do sistema. Após o fornecimento
 * dos dados, o sistema deverá realizar o cálculo das áreas de cada figura e exibir os seguintes resultados: 
 * a) A área calculada para cada figura geométrica. 
 * b) A figura geométrica com menor área. 
 * c) A figura geométrica com maior área. 
 * d) Exibir as áreas das figuras geométricas de forma crescente (da menor para a maior).
 */
import java.util.*;

public class Ex1
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] areas = new double[4];
        String[] nomes = {"Retângulo", "Triângulo", "Quadrado", "Círculo"};

        // Retângulo
        System.out.print("Digite a base do retângulo: ");
        double baseRet = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double alturaRet = sc.nextDouble();
        areas[0] = baseRet * alturaRet;

        // Triângulo
        System.out.print("Digite a base do triângulo: ");
        double baseTri = sc.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double alturaTri = sc.nextDouble();
        areas[1] = (baseTri * alturaTri) / 2;

        // Quadrado
        System.out.print("Digite o lado do quadrado: ");
        double ladoQuad = sc.nextDouble();
        areas[2] = ladoQuad * ladoQuad;

        // Círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        areas[3] = Math.PI * raio * raio;

        System.out.println("\nÁreas calculadas:");
        for (int i = 0; i < areas.length; i++) {
            System.out.printf("%s: %.2f\n", nomes[i], areas[i]);
        }

        // Maior e menor área
        double maior = areas[0], menor = areas[0];
        String nomeMaior = nomes[0], nomeMenor = nomes[0];
        for (int i = 1; i < areas.length; i++) {
            if (areas[i] > maior) {
                maior = areas[i];
                nomeMaior = nomes[i];
            }
            if (areas[i] < menor) {
                menor = areas[i];
                nomeMenor = nomes[i];
            }
        }

        System.out.printf("\nMaior área: %s (%.2f)\n", nomeMaior, maior);
        System.out.printf("Menor área: %s (%.2f)\n", nomeMenor, menor);

        // Ordenação crescente
        Double[] areasOrdenadas = Arrays.stream(areas).boxed().toArray(Double[]::new);
        Arrays.sort(areasOrdenadas);

        System.out.println("\nÁreas em ordem crescente:");
        for (double a : areasOrdenadas) {
            System.out.printf("%.2f\n", a);
        }

        sc.close();
    }
}
