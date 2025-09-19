/* Ler os valores de quatro notas escolares de um aluno. Calcular a média aritmética e apresentar a
seguinte mensagem “aprovado” se a média obtida for maior ou igual a 5, caso contrário, apresentar a
mensagem “reprovado”. Informar junto de cada mensagem o valor da média obtida. 
 */

import java.util.Scanner;

public class Ex03 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media = 0.00;
        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = input.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média final: " + media);
        if (media >= 5) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
