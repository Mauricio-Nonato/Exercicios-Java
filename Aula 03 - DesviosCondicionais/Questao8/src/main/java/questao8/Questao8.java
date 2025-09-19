// Q8 – PARCELA EM ATRASO – Crie uma aplicação que é responsável por apresentar o valor total de uma
// prestação que foi paga em atraso, a formula para realizar o cálculo da prestação é: PRESTAÇÃO =
// VALOR = (VALOR * (TAXA / 100) * TEMPO).

package questao8;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CALCULO DE PRESTACAO EM ATRASO ===");

        System.out.print("Digite o valor original da prestacao: R$ ");
        double valor = teclado.nextDouble();

        System.out.print("Digite a taxa de juros (% ao mes): ");
        double taxa = teclado.nextDouble();

        System.out.print("Digite o tempo de atraso (em meses): ");
        int tempo = teclado.nextInt();

        double prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.printf("Valor total da prestação em atraso: R$ ", prestacao);
    }
}
