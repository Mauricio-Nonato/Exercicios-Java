// Q10 – MÉDIA FINAL LP – Crie uma aplicação que calcule a média final de um determinado aluno, a
// regra para cálculo da média final é data através da imagem abaixo: Atenção o programa deverá exibir
// a nota da NP1, NP2 e também MF.

package questao10;

import java.util.Scanner;
public class Questao10 {

    public static void main(String[] args) {
	   double mediafinal, n1, n2, atv1, ead1, avaliacao1, atv2, ead2, avaliacao2, pluri  = 0;
	   Scanner teclado = new Scanner(System.in);
	   
	   System.out.println("-Vamos determinar a sua média final?-");
	   
	   //Informações primeiro semestre
	   System.out.println("***1°SEMESTRE***");
	   System.out.println("Digite a sua nota da sua primeira atividade: ");
	   atv1 = teclado.nextDouble();
	   System.out.println("Digite a sua nota do ead do primeiro semestre: ");
	   ead1 = teclado.nextDouble();
	   System.out.println("Digite a nota da sua primeira avaliação: ");
	   avaliacao1 = teclado.nextDouble();
	   
	   //Informações segundo semestre
	   System.out.println("***2°SEMESTRE***");
	   System.out.println("Digite a sua nota da segunda atividade:");
	   atv2 = teclado.nextDouble();
	   System.out.println("Digite a sua nota do ead do degundo semestre: ");
	   ead2 = teclado.nextDouble();
	   System.out.println("Digite a nota da segunda avaliação: ");
	   avaliacao2 = teclado.nextDouble();
	   System.out.println("Digite a nota da prova integrativa: ");
	   pluri = teclado.nextDouble();
	  
	  n1 = (atv1 * 0.20) + (ead1 * 0.20) + (avaliacao1 * 0.60);
	  n2 = (atv2 * 0.20) + (ead2 * 0.20) + (avaliacao2 * 0.40) + (pluri * 0.20);
	  mediafinal = n1 + n2;
	 
	 System.out.println("A sua nota 1 é: " + n1);
	 System.out.println("A sua nota 2 é: " + n2);
	 System.out.println("A média final é: " + mediafinal);
	}
}
