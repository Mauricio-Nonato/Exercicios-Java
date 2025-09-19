// Q1 – CALCULAR A MÉDIA NOTAS – Crie uma aplicação console que dado o valor de 3 notas escolares de 0 a 10 deverá calcular a média.

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota (0 a 10): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (0 a 10): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (0 a 10): ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das notas é: %.2f\n", media);

        scanner.close();
    }
}
