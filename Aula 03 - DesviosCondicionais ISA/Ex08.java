/* Ler 5 valores numéricos inteiros, identificar e apresentar o maior e o menor dentre os valores
informados. Não execute a ordenação dos valores. */

import java.util.Scanner;

public class Ex08 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int maiorNum = 0;
        int menorNum = 0;
        System.out.print("Digite o 1° número: ");
        num = input.nextInt();
        maiorNum = num;
        menorNum = num;
        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            num = input.nextInt();
            if (num > maiorNum) {
                maiorNum = num;
            }
            if (num <= menorNum) {
                menorNum = num;
            }
        }
        System.out.println("O maior valor digitado foi " + maiorNum + " e o menor foi " + menorNum);
    }
}
