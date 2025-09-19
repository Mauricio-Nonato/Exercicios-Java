/* ORDENAR – Crie uma aplicação que solicite do usuário 3 valores inteiros quaisquer em qualquer ordem,
os valores deverão ser apresentados ordenados.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Ex01 {
    public static void main(String args[]) {
        byte[] val = new byte[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i+1) + "° valor: ");
            val[i] = input.nextByte();
        }
        // organiza os valores dentro do array em ordem decrescente
        Arrays.sort(val);
        // o converte em string para saida
        System.out.println("Valores ordenados: " + Arrays.toString(val));
        input.close();
    }
}