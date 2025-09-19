/* SOMA 100 VALORES – Crie uma aplicação que percorra do número 1 ao número 100, ao final deverá
ser exibida a soma de todos os valores entre 1 e 100 (1+2+3+4+5+6+7+...97+98+99+100).  */


public class Ex03 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma =  soma + i; 
            System.out.printf("%d +", i);
        }
        System.out.println("\n = " + soma);
    }
}
