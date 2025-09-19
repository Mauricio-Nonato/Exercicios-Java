// Q7 – VOLUME LATA DE OLÉO – Crie uma aplicação deva apresentar o volume de uma lata de óleo
// baseado em sua altura e raio, a formula para o cálculo é VOLUME = 3.14149 * R2 * ALTURA.

// VOLUME = 3.14149 * R2 * ALTURA

package questao7;
import java.util.Scanner;

public class Questao7 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CALCULADORA DE VOLUME LATA DE OLEO");
        System.out.print("Altura da Lata: ");
        float altura = teclado.nextFloat();
        System.out.print("Raio da Lata: ");
        float raio = teclado.nextFloat();
        
        System.out.print("O Volume da Lata é: " + (3.14149f * (raio*raio)) * altura);
    }
}
