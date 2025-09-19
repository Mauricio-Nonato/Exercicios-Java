// Q4 Ler os valores de quatro notas escolares de um aluno. Calcular a média aritmética e apresentar a
// mensagem “aprovado” se a média obtida for maior ou igual a 7, caso contrário, o prova deve solicitar
// a nota de exame do aluno e calcular a nova média aritmética entre a nota de exame e a primeira média
// aritmética. Se o valor da nova média for maior ou igual a 5, apresentar a mensagem “aprovado em
// exame”, caso contrário, apresentar a mensagem “reprovado”. Informar junto de cada mensagem o
// valor da média obtida.

package questao4;

import java.util.Scanner;
public class Questao4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("- Questao 3 -");
    
        System.out.print("Valor da N1: ");
        float n1 = teclado.nextInt();
        
        System.out.print("Valor da N2: ");
        float n2 = teclado.nextInt();
        
        System.out.print("Valor da N3: ");
        float n3 = teclado.nextInt();
        
       System.out.print("Valor da N4: ");
        float n4 = teclado.nextInt();
        
        float media = (n1 + n2 + n3 + n4) / 4;
        
        if (media >= 7) {
            System.out.println("Aprovado com media " + media);
        }
        else {
            System.out.print("Valor do exame: ");
            float recuperacao = teclado.nextInt();
            float media2 = (media + recuperacao) / 2;
            if (media2 >= 5) {
            System.out.println("Aprovado em exame com media " + media2);    
            }
            else {
                System.out.println("Reprovado com media " + media2);
            }
        }
    }
}

