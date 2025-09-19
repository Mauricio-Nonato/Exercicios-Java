/* Ler um valor numérico inteiro e apresentar a mensagem se o valor informado é par ou ímpar. */

import java.util.Scanner;

public class Ex09 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        System.out.print("Digite um número: ");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é PAR");
        } else {
            System.out.println("O número " + num + " é IMPAR");
        }
    }
}
