/* Q8
BASE E EXPOENTE – Crie um programa que apresente como resultado o valor de uma potência de uma
base qualquer elevada a um expoente qualquer, ou seja, BE
, em que B é o valor da BASE e E o valor do
EXPOENTE. Os valores da base e do expoente devem ser fornecidos pelo usuário. Dica: Inicie com
valore de base e expoente baixos, como por exemplo base 3 e expoente 4, 34 = 81.
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada da base
        System.out.print("Digite o valor da base: ");
        int base = input.nextInt();

        // Entrada do expoente
        System.out.print("Digite o valor do expoente: ");
        int expoente = input.nextInt();

        // Cálculo da potência
        double resultado = Math.pow(base, expoente);

        // Saída do resultado
        System.out.println(base + "^" + expoente + " = " + (int)resultado);

        input.close();
    }
}
