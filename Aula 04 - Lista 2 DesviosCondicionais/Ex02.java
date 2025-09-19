/* Ler um valor inteiro e apresentar uma mensagem informando se o valor é um número par ou ímpar. */

import java.util.Scanner;

public class Ex02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int val;
        System.out.print("Digite um valor: ");
        val = input.nextInt();
        if (val % 2 == 0) {
            System.out.println(val + " É PAR");
        } else {
            System.out.println(val + " É IMPAR");
        }
    }
}
