/* CLASSIFICAR POR IDADE - Crie uma aplicação que deverá solicitar do usuário uma idade qualquer
(número inteiro), com base nessa idade, o sistema deverá exibir diferentes mensagens conforme a
tabela a seguir: a) Idade entre 0 e 10 anos - Olá criança, b) Idade entre 11 e 14 anos - Olá, você é um(a)
pré-adolescente; c) Idade entre 15 e 18 anos - Parabéns, você já pode ser um eleitor; d) Idade entre 19
e 21 anos - Hummm, você já é um adulto; e) Acima de 21 anos - Bem, agora já está na hora de sair de
casa e seguir sua vida...
 */

import java.util.Scanner;

public class Ex03 {
    public static void main(String args[]) {
        byte idade;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = input.nextByte();

        if (idade < 0 || idade > 127) {
            System.out.println("idade invalida! ");
        } else if (idade <= 10) {
            System.out.println("Olá criança");
        } else if(idade >= 11 && idade <= 14) {
            System.out.println("Olá, você é um(a) pré-adolescente");
        } else if(idade >= 15 && idade <= 18) {
            System.out.println("Parabéns, você já pode ser um eleitor");
        } else if (idade >= 19 && idade <= 21) {
            System.out.print("Hummm, você já é um adulto");
        } else {
            System.out.println("Bem, agora já está na hora de você sair da sua casa e seguir sua vida...");
        }
    input.close();
    }
}
