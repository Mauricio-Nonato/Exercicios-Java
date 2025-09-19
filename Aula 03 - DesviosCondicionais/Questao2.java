// Q2 Ler um valor numérico inteiro positivo ou negativo e apresentar o valor lido como sendo um valor
// positivo, ou seja, se o valor lido for menor ou igual a zero, ele deve ser multiplicado por -1.

package questao2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("=== Questao 2 ===");
       
        System.out.print("Digite um valor negativo ou positivo: ");
        int valor = teclado.nextInt();
        
        if (valor <= 0){
            int positivo = valor * -1;
            System.out.println("Resultado: " + positivo);            
        }
        else {
            System.out.println("Resultado: " + valor);   
        }

        
    }
}
