/* Ler um valor numérico inteiro qualquer e fazer a sua apresentação caso o valor não seja maior que
TRES. Utilize apenas o .não. (da tabela de operadores lógicos) para a solução do problema. Atenção
para esse problema não deve ser utilizado os operadores relacionais.  */

import java.util.Scanner;

public class Ex04 {
    public static void main(String args[]) {
        byte num;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = input.nextByte();
        if (!(num > 3)) {
            System.out.println("Número " + " permitido!");
        } else {
            System.out.println("Número não permitido! ( acima de 3 )");
        }
    }
}
