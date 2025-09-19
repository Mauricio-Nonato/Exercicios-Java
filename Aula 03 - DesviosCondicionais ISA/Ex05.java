/* Ler três valores numérico (representados por a, b, c) e efetuar o cálculo da equação completa de
segundo grau utilizando a formula de baskara (considere todas as possíveis condições para delta: delta
< 0, delta > 0 e delta = 0). Lembre-se de que é completa a equação de segundo grau que possui
simultaneamente as variáveis A, B e C diferentes de zero. Caso necessário, pesquise como utilizar
operação de raiz quadrada.
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int a, b, c, delta, x1, x2 = 0;
        System.out.print("Digite o valor de a: ");
        a = input.nextInt();
        System.out.print("Digite o valor de b: ");
        b = input.nextInt();
        System.out.print("Digite o valor de c: ");
        c = input.nextInt();
        delta = (b * b) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Delta negativo, não existe raiz real.");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Delta igual a zero, existe apenas uma raiz real: " + x1);
        } else {
            x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Delta positivo, existem duas raízes reais: " + x1 + " e " + x2);
        }
    }
}
