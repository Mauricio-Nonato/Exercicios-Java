/* MAIOR COM VALIDACAO - Crie uma aplicação que deverá solicitar do usuário dois valores numéricos
inteiros quaisquer, essa deverá exibir na tela o maior valor informado no entanto antes de verificar
qual o maior valor, a aplicação deverá validar se os valores são iguais, e caso sejam, deverá exibir uma
mensagem ao usuário informando que valores iguais não é permitido.  */

import java.util.Scanner;

public class Ex02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1° valor: ");
        byte val1 = input.nextByte();
        System.out.print("Digite o 2° valor: ");
        byte val2 = input.nextByte();

        if (val1 == val2) {
            System.out.println("Dois valores iguais não são permitidos");
        } else if (val1 > val2) {
            System.out.println("Maior valor digitado: " + val1);
        } else {
            System.out.println("Maior valor digitado: " + val2);
        }
        input.close();
    }
}
