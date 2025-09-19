/*
 * Q8 – PARCELA EM ATRASO – Crie uma aplicação que é responsável por apresentar
 * o valor total de uma prestação que foi paga em atraso, a formula para realizar
 * o cálculo da prestação é: PRESTAÇÃO = VALOR = (VALOR * (TAXA / 100) * TEMPO).
 */
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da prestação: ");
        double valor = scanner.nextDouble();

        System.out.print("Informe a taxa de juros (%): ");
        double taxa = scanner.nextDouble();

        System.out.print("Informe o tempo de atraso (em meses ou dias): ");
        int tempo = scanner.nextInt();

        double prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.printf("O valor da prestação em atraso é: R$ %.2f\n", prestacao);

        scanner.close();
    }
}
