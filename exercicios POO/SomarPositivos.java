import java.util.Scanner;

public class SomarPositivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite um valor (negativo para parar): ");
            double n = teclado.nextDouble();
            if (n < 0) break;

            soma += n;
            contador++;
        }

        double media = contador > 0 ? soma / contador : 0;
        System.out.println("Soma: " + soma + ", Quantidade: " + contador + ", Média: " + media);
        teclado.close();
    }
}
