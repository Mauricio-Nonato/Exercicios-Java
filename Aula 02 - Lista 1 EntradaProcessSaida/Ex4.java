/* 
* Q4 – AREA CIRCUNFERÊNCIA – Crie uma aplicação de será responsável por calcular
* a área de uma circunferência (pesquise caso tenha dúvidas de como calcular a 
* área de uma circunferência). 
*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área da circunferência é: %.2f\n", area);

        scanner.close();
    }
}
