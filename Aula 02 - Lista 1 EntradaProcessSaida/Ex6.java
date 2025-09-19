/*
* Q6 – CONVERSÕES DE TEMPERATURA – Crie uma aplicação que dado um valor
* de temperatura em graus Celsius deverá apresentar o resultado convertido em graus Fahrenheit.
*/
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Temperatura em Fahrenheit: %.2f\n", fahrenheit);

        scanner.close();
    }
}
