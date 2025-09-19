/* FATORIAL – Crie uma aplicação que deverá solicitar do usuário um valor inteiro qualquer, com base no
valor fornecido calcule o fatorial e apresente o resultado do fatorial do valor fornecido.  */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int n = input.nextInt();

        // Variável para armazenar o resultado
        long fatorial = 1;

        // Cálculo do fatorial
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        // Saída do resultado
        System.out.println(n + "! = " + fatorial);

        input.close();
    }
}
