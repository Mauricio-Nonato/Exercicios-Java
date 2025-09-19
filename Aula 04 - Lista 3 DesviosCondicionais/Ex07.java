/* CONTAR PARES E IMPARES – Crie uma aplicação que deve solicitar do usuário 5 valores inteiros
quaisquer, a aplicação deverá apresentar duas mensagens de saída, a primeira deverá informar a
quantidade de números pares e impares fornecidos, a segunda deverá informar qual foi o tipo de
número (par/impar) mais fornecido.  */

import java.util.Scanner;;

public class Ex07 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num, numImpar = 0;
        int numPar = 0;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %d° valor: ", i+1);
            num = input.nextInt();
            if (num % 2 == 0) {
                numPar++;
            } else {
                numImpar++;
            }
        }
        System.out.println("Número de valores pares fornecidos: " + numPar);
        System.out.println("Número de valores pares fornecidos: " + numImpar);
        if (numPar > numImpar) {
            System.out.println("Foi digitado mais valores pares");
        } else if (numImpar > numPar) {
            System.out.println("Foi digitado mais valores impares");
        } else {
            System.out.println("Foi digitado o mesmo numero de valores pares e impares");
        }

        input.close();
    }
}
