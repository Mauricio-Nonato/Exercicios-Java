/* Leia dois valores numéricos inteiros e apresente o resultado da diferença do maior valor pelo menor
valor */

import java.util.Scanner;

public class Ex01 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2 = 0;
        System.out.print("Digite o 1° valor: ");
        valor1 = input.nextInt();
        System.out.print("Digite o 2° valor: ");
        valor2 = input.nextInt();
        if (valor1 > valor2) {
            System.out.println("Maior valor: " + valor1);
            System.out.println("Menor valor: " + valor2);
            System.out.println("A Diferença entre o maior valor e o menor valor é: " + (valor1 - valor2));
        } else {
            System.out.println("Maior valor: " + valor2);
            System.out.println("Menor valor: " + valor1);
            System.out.println("A Diferença entre o maior valor e o menor valor é: " + (valor2 - valor1));
        }
    }
}