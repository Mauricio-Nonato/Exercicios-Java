// Q9 – COVERSÃO MONETÁRIA – Crie uma aplicação que deve receber do usuário um determinado valor
// em REAIS, e também a cotação do Dolar e Euro, baseado nestas informações, o programa deverá
// calcular e apresentar qual o valor que o usuário tem em Doláres e Euros convertidos.

package questao9;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Questao9 {
           
	public static void main(String[] args) {
	   double valoreal, valordolar, valoreuro  = 0;
	   Scanner teclado = new Scanner(System.in);
	   DecimalFormat formatacao = new DecimalFormat("#.##");
	   
	   System.out.println("----CONVERTOR----");
	   System.out.println("Digite um valor: ");
	   valoreal = teclado.nextDouble();
	  
	  
	   //levando em consideração que 1 dólar = 5,40 reais 
	   valordolar = valoreal / 5.40; 
	   //levando em consideração que 1 euro = 6,33 reais 
	   valoreuro = valoreal / 6.33;
	   
	  
	    System.out.println("O valor R$" + valoreal + " convertidos em: ");
	    //mostrar no print com apenas duas casas decimais
	    System.out.println("Dólar: " + formatacao.format(valordolar));
	    System.out.println("Euro: " + formatacao.format(valoreuro));
	}
}
