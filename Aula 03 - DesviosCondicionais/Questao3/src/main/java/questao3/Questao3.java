// Q3 Ler os valores de quatro notas escolares de um aluno. Calcular a média aritmética e apresentar a
// seguinte mensagem “aprovado” se a média obtida for maior ou igual a 5, caso contrário, apresentar a
// mensagem “reprovado”. Informar junto de cada mensagem o valor da média obtida

package questao3;

import java.util.Scanner;
public class Questao3 {

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
        
        if (media >= 5) {
            System.out.println("Aprovado com media " + media);
        }
        else {
            System.out.println("Reprovado com media " + media);   
        }   
    }
}
