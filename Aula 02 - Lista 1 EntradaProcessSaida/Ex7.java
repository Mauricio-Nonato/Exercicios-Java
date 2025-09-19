/* 
 * Q7 – VOLUME LATA DE OLÉO – Crie uma aplicação deva apresentar
 * o volume de uma lata de óleo baseado em sua altura e raio, 
 * a formula para o cálculo é VOLUME = 3.14149 * R2 * ALTURA.
*/
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio da lata: ");
        double raio = scanner.nextDouble();

        System.out.print("Informe a altura da lata: ");
        double altura = scanner.nextDouble();

        double volume = 3.14149 * Math.pow(raio, 2) * altura;

        System.out.printf("O volume da lata de óleo é: %.2f\n", volume);

        scanner.close();
    }
}
