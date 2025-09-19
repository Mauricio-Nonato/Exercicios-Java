/* SOMAR PARES – Crie uma aplicação que percorra os valores na faixa de 1 a 500 e que no final apresente
a soma de todos os valores pares existentes dentro da faixa percorrida. */

public class Ex04 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 500; i++) {
            if (i %  2 == 0) {
                soma = soma + i;
            }
        }
        System.out.println("Soma dos valores pares entre 1 e 500 é: " + soma);
    }
}
