/* EXIBIR ÍMPARES – Crie uma aplicação que percorra os valores em uma faixa de 1 a 20 e apresente
todos os valores ímpares existentes dentro desta faixa de valores.  */

public class Ex05 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 20; i++) {
            if (i %  2 != 0) {
                soma = soma + i;
            }
        }
        System.out.println("Soma dos valores impares entre 1 e 20 é: " + soma);
    }
}
