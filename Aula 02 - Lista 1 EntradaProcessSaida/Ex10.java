/*
 * Q10 – MÉDIA FINAL LP – Crie uma aplicação que calcule a média final
 * de um determinado aluno, a regra para cálculo da média final é data
 * através da imagem abaixo: Atenção o programa deverá exibir a nota da NP1, NP2 e também MF.
 */
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota NP1: ");
        double np1 = scanner.nextDouble();

        System.out.print("Informe a nota NP2: ");
        double np2 = scanner.nextDouble();

        double mediaFinal = (np1 + np2) / 2;

        System.out.printf("Nota NP1: %.2f\n", np1);
        System.out.printf("Nota NP2: %.2f\n", np2);
        System.out.printf("Média Final: %.2f\n", mediaFinal);

        scanner.close();
    }
}
