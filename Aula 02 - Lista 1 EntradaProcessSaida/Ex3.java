/* 
* Q3 – CALCULAR O GASTO TOTAL DA FACULDADE – Crie uma aplicação consome que deverá calcular
* o valor mensal/anual total gasto com a faculdade, esse cálculo deverá ser composto por:
* a) Valor da mensalidade;
* b) Custo com transporte (van, ônibus, uber, taxi, carona, etc. cada aluno deverá adicionar o custo de transporte de acordo com seu uso); 
* c) Custo de alimentação (lanches, refrigerantes, etc.). No final o sistema deverá exibir o custo total mensal e anual.
*/
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da mensalidade: ");
        double mensalidade = scanner.nextDouble();

        System.out.print("Informe o custo mensal com transporte: ");
        double transporte = scanner.nextDouble();

        System.out.print("Informe o custo mensal com alimentação: ");
        double alimentacao = scanner.nextDouble();

        double custoMensal = mensalidade + transporte + alimentacao;
        double custoAnual = custoMensal * 12;

        System.out.printf("Custo mensal total: R$ %.2f\n", custoMensal);
        System.out.printf("Custo anual total: R$ %.2f\n", custoAnual);

        scanner.close();
    }
}
