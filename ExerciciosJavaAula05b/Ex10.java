
import java.util.Scanner;

public class Ex10 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long somaFatoriais = 0; // variável acumuladora da soma

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int n = sc.nextInt();

            // Calcula o fatorial do número lido
            long fatorial = 1;
            for (int j = 1; j <= n; j++) {
                fatorial *= j;
            }

            // Mostra o fatorial calculado de cada número
            System.out.println(n + "! = " + fatorial);

            // Acumula na soma
            somaFatoriais += fatorial;
        }

        // Exibe o resultado final
        System.out.println("Somatório dos fatoriais = " + somaFatoriais);

        sc.close();
    }
}
