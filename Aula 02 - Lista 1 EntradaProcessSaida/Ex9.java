/*
 * Q9 – COVERSÃO MONETÁRIA – Crie uma aplicação que deve receber do usuário
 * um determinado valor em REAIS, e também a cotação do Dolar e Euro, 
 * baseado nestas informações, o programa deverá calcular e apresentar
 * qual o valor que o usuário tem em Doláres e Euros convertidos.
 */
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor em Reais: ");
        double reais = scanner.nextDouble();

        System.out.print("Informe a cotação do Dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Informe a cotação do Euro: ");
        double cotacaoEuro = scanner.nextDouble();

        double emDolar = reais / cotacaoDolar;
        double emEuro = reais / cotacaoEuro;

        System.out.printf("Valor em Dólar: %.2f\n", emDolar);
        System.out.printf("Valor em Euro: %.2f\n", emEuro);

        scanner.close();
    }
}
