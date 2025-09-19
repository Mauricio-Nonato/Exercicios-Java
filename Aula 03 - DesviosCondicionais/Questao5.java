package questao5;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Questao 5");
        System.out.println("------------------------------------");

        System.out.print("Digite o valor de a: ");
        int a = teclado.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = teclado.nextInt();

        System.out.print("Digite o valor de c: ");
        int c = teclado.nextInt();

        if (a != 0 && b != 0 && c != 0) {
            double delta = b * b - 4 * a * c;
            System.out.println("Delta = " + delta);

            if (delta < 0) {
                System.out.println("Não existem raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2.0 * a);
                System.out.println("Existe uma raiz real: x = " + x);
            } else {
                double raizDelta = Math.sqrt(delta);
                double x1 = (-b + raizDelta) / (2.0 * a);
                double x2 = (-b - raizDelta) / (2.0 * a);
                System.out.println("Existem duas raízes reais:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        } else {
            System.out.println("A equação não é do segundo grau completa (a, b e c devem ser diferentes de zero).");
        }
    }
}
