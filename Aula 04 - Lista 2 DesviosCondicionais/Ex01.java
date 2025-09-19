/* Ler cinco valores numéricos inteiros, identificar e apresentar o maior e o menor valor informado dentre
os valores lidos. Atenção, não deve ser realizada ordenação dos mesmos, não deve ser realizado uso
de vetores e nem comandos de repetição. */

import java.util.Scanner;

public class Ex01 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int val1, val2, val3, val4, val5= 0;
        System.out.print("Digite o 1° valor: ");
        val1 = input.nextInt();
        int maiorVal = val1;
        int menorVal = val1;
        System.out.print("Digite o 2° valor: ");
        val2 = input.nextInt();
        System.out.print("Digite o 3° valor: ");
        val3 = input.nextInt();
        System.out.print("Digite o 4° valor: ");
        val4 = input.nextInt();
        System.out.print("Digite o 5° valor: ");
        val5 = input.nextInt();
        /* teste do maior valor, usa o if de forma simplificada onde se tal valor for maior que maiorVal
         * que esta com o valor de val1 logo o maiorVal recebe aquele valor
         */
        if (val2 > maiorVal) maiorVal = val2;
        if (val3 > maiorVal) maiorVal = val3;
        if (val4 > maiorVal) maiorVal = val4;
        if (val5 > maiorVal) maiorVal = val5;
        /* teste do menor val, funciona do mesmo jeito, apenas trocando a condição de > para < */
        if (val2 < menorVal) menorVal = val2;
        if (val3 < menorVal) menorVal = val3;
        if (val4 < menorVal) menorVal = val4;
        if (val5 < menorVal) menorVal = val5;
        System.out.println("O maior valor digitado foi: " + maiorVal);
        System.out.println("O menor valor digitado foi: " + menorVal);
        input.close();
    }
}