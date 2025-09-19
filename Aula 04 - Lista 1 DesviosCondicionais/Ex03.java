/* Ler um valor numérico inteiro que seja na faixa de valores de 1 até 9. O programa deve apresentar a
mensagem “O valor está na faixa permitida!”, caso o valor esteja fora da faixa deverá exibir a
mensagem “O valor informado não é permitido pois não está na faixa de 1 a 9”. */

import java.util.Scanner;

public class Ex03 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        byte val = input.nextByte();

        if (val >= 1 && val <= 9) {
            System.out.println("O valor esta na faixa permitida!");
        } else {
            System.out.println("O vaor informado não é permitido pois não está na faixa de 1 a 9");
        }
    }
}
