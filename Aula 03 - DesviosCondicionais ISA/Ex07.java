/* Ler quatro valores numéricos inteiros e apresentar os valores que são divisíveis por 2 ou 3. Caso
necessário, pesquise como é possível obter o resto da divisão para saber se os números são divisíveis. */

import java.util.Scanner;

public class Ex07 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, contador = 0;
        System.out.print("Digite o 1° Valor: ");
        num1 = input.nextInt();
        System.out.print("Digite o 2° Valor: ");
        num2 = input.nextInt();
        System.out.print("Digite o 3° Valor: ");
        num3 = input.nextInt();
        System.out.print("Digite o 4° Valor: ");
        num4 = input.nextInt();

        System.out.print("Números digitados que são divisiveis por 2 e 3: ");
        if (num1 % 2 == 0 && num1 % 3 == 0) {
            System.out.print(num1);
            contador = contador + 1;
        }
        if (num2 % 2 == 0 && num2 % 3 == 0) {
            System.out.print(", " + num2);
            contador = contador + 1;
        }
        if (num3 % 2 == 0 && num3 % 3 == 0) {
            System.out.print(", " + num3);
            contador = contador + 1;
        }
        if (num4 % 2 == 0 && num4 % 3 == 0) {
            System.out.print(", " + num4);
            contador = contador + 1;
        }
        if (contador == 0) {
            System.out.print("Nenhum número é divisível por 2 e 3.");
        }
    }
}
