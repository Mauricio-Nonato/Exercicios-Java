import java.util.Scanner;

public class SomaFatoriais {
    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();
            soma += fatorial(n);
        }

        System.out.println("Soma dos fatoriais: " + soma);
        sc.close();
    }
}
