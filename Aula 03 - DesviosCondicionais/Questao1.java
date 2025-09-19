// Q1 Leia dois valores numéricos inteiros e apresente o resultado da diferença do maior valor pelo menor valor.

package questao1.questao1;

import java.util.Scanner;
public class Questao1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("===Calculadora da diferença do maior valor pelo menor valor===");
        
        System.out.print("Digite o 1 valor: ");
        float valor1 = teclado.nextInt();
        
        System.out.print("Digite o 2 valor: ");
        float valor2 = teclado.nextInt();
  
        if (valor1 > valor2) { 
            float media1 = valor1 / valor2;
            System.out.println("Resultado: " + media1);}
        else{
            float media2 = valor2 / valor1;
            System.out.println("Resultado: " + media2);}
        }
    }

