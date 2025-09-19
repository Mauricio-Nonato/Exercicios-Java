/* TABUADA – Crie uma aplicação que apresente o resultado de uma tabuada de um número qualquer
fornecido pelo usuário, por exemplo, se o usuário fornecer o número 2, deverá ser impresso os valores
da seguinte forma:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
(...)
2 x 10 = 20 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        System.out.print("Digite um número: ");
        n = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i );
        }
        input.close();
    }
}
