/* Ler um valor numérico inteiro que esteja na faixa de valores de 1 até 9. O programa deverá apresentar
a mensagem “O valor está na faixa permitida”, caso o valor informado esteja entre 1 e 9. Se o valor
estiver fora da faixa, o programa deverá apresentar a mensagem “O valor está fora da faixa permitida”. */

import java.util.Scanner;

public class Ex10 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        System.out.print("Digite um número: ");
        num = input.nextInt();
        if (num >= 1 && num <= 9) {
            System.out.println("O valor está na faixa permitida");
        } else {
            System.out.println("O valor está fora da faixa permitida");
        }
    }
}
