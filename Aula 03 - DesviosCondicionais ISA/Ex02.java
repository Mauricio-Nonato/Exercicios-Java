/* Ler um valor numérico inteiro positivo ou negativo e apresentar o valor lido como sendo um valor
positivo, ou seja, se o valor lido for menor ou igual a zero, ele deve ser multiplicado por -1.   */

import java.util.Scanner;

public class Ex02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int valor = 0;
        System.out.print("Digite um valor inteiro: ");
        valor = input.nextInt();
        if (valor >= 0) {
            System.out.println("valor já positivo!");
        } else {
            System.out.println("Valor transformado em positivo: " + (valor * -1));
        }
    }
}
