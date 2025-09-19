/* QUADRADO – Crie uma aplicação de percorra do número 15 ao número 50 e apresente o valor ao
quadrado de cada um dos valores entre 15 e 50. */

public class Ex01 {
    public static void main(String[] args) {
        for (int i = 15; i < 50; i++) {
            System.out.printf("O quadrado de %d é: %d\n", i, i*i);
        }
    }
}