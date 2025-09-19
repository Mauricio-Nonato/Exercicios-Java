// Q6 – CONVERSÕES DE TEMPERATURA – Crie uma aplicação que dado um valor de temperatura em
// graus Celsius deverá apresentar o resultado convertido em graus Fahrenheit.

// F = (C * 1.8) + 32
package questao6;
import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Conversor de temperatura");
        System.out.println("--------------------");
        
        System.out.print("Digite a temperatura em Graus Celsius: ");
        float graus = teclado.nextInt();
        System.out.println("--------------------");
        System.out.println("Valor em Celsius: " + graus);
        System.out.println("Valor em Fahrenheit: " + ((graus * 1.80) + 32));
    }
}
