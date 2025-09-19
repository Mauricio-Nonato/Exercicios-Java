/* Crie uma aplicação que deverá solicitar do usuário (aluno) três notas, sendo
que a primeira corresponderá a nota da avaliação 01, a segunda da avaliação 02 e a terceira referente
a entrega de um trabalho, com base nestas três notas, aplique os seguintes pesos para calcular a média:
30%, 40% e 30%. Com a média calculada verifique se o aluno foi aprovado ou reprovado conforme
orientações que seguem: a) Se a média estiver entre 0 e 4.99 - "Reprovado"; b) Se a média estiver entre
5.00 e 7.49 - "Aprovado"; c) Se a média estiver acima de 7.50 - "Parabéns, você foi aprovado com
excelência". */

import java.util.Scanner;

public class EX05 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double p1, p2, trabalho, media = 0.0;

        System.out.print("DIgite a nota da avaliação 1: ");
        p1 = input.nextDouble();
        System.out.print("DIgite a nota da avaliação 2: ");
        p2 = input.nextDouble();
        System.out.print("DIgite a nota do Trabalho: ");
        trabalho = input.nextDouble();

        media = (p1 * 0.30) + (p2 * 0.40) + (trabalho * 0.30);
        System.out.println("Média: " + media);
        if (media <= 4.99) {
            System.out.println("Você foi REPROVADO");
        } else if (media > 4.99 && media <= 7.49) {
            System.out.println("Você foi APROVADO");
        } else {
            System.out.println("PARABENS, você foi APROVADO COM EXCELÊNCIA");
        }

        input.close();
    }
}
