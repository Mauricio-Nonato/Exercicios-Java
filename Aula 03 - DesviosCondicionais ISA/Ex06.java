/* Ler quatro valores numéricos inteiros e apresentar os valores que são divisíveis por 2 e 3. Caso
necessário, pesquise como é possível obter o resto da divisão para saber se os números são divisíveis. */

import java.util.Scanner;
import java.util.Arrays;

public class Ex06 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] num =  new int[4];
        int[] numDivisiveis = new int[4];
        int c = 0;
        
        for (int i = 0; i < 4   ; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            num[i] = input.nextInt();
            if (num[i] % 2 == 0 && num[i] % 3 == 0) {
                numDivisiveis[c] = num[i];
                c++;
            }
        }
        System.out.print("numeros divisiveis por 2 e 3: " + Arrays.toString(numDivisiveis));
    }
}
