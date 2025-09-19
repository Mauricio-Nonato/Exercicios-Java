/* ORDENAR COM BLOQUEIO DE VALORES REPETIDOS - Crie uma aplicação que deverá solicitar do usuário
03 valores, assim que a aplicação contiver os três valores, a mesma deverá exibi-los em ordem
crescente. A aplicação não deverá permitir que sejam fornecidos valores repetidos. */

import java.util.Scanner;
import java.util.Arrays;

public class Ex06 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[3];
        boolean repetiu = false;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %d° valor\n", i + 1);
            num[i] = input.nextInt();
        }
        Arrays.sort(num);
        for (int c = 0; c < num.length - 1; c++) {
            if (num[c] == num[c + 1]) {
                repetiu = true;
                break;
            }
        }
        if (repetiu) {
            System.out.println("ERRO: Número repetido encontrado! ");
        } else {
            System.out.println("Números digitados em ordem crescente: " + Arrays.toString(num));
        }
        input.close();
    }
}
