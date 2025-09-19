/* Ler os valores de quatro notas escolares de um aluno. Calcular a média aritmética e apresentar a
mensagem “aprovado” se a média obtida for maior ou igual a 7, caso contrário, o prova deve solicitar
a nota de exame do aluno e calcular a nova média aritmética entre a nota de exame e a primeira média
aritmética. Se o valor da nova média for maior ou igual a 5, apresentar a mensagem “aprovado em
exame”, caso contrário, apresentar a mensagem “reprovado”. Informar junto de cada mensagem o
valor da média obtida. */

import java.util.Scanner;

public class Ex04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, notaExame, media = 0.00;

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = input.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média Final: " + media);
        if (media >= 7) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("Nota não alcançada, digite a nota do seu Exame: ");
            notaExame = input.nextDouble();
            media = (nota1 + nota2 + nota3 + nota4 + notaExame) / 5;
            System.out.println("Média Final (com Exame): " + media);
            if (media >= 5) {
                System.out.println("APROVADO EM EXAME");
            } else {
                System.out.println("REPROVADO");
            }
        }
    }
}
