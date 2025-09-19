// Q5 – INFORMAÇÕES SALARIAIS – Crie uma aplicação que forneça várias informações salariais referente
// ao salário de um determinado professor que ganha R$ 25,00 por aula. A aplicação criada deverá:
// a) Solicitar qual a quantidade de aulas semanais que o professor leciona;
// b) Deverá apresentar o salário bruto mensal, considerando que o mês é composto por 4 semanas e
// que o professor tem um acréscimo de 10% (referente ao vale alimentação, vale transporte e plano de
// saúde).
// c) Deverá apresentar os valores descontados em folha de pagamento, que são 5% de IR e 7% de INSS.
// d) Deverá apresentar o valor do salário líquido do professor (salário bruto menos os descontos).
// ******************************************************************************************
// 

package questao5v2;

import java.util.Scanner;

public class Questao5V2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("INFORMACES SALARIAIS");
        System.out.println("------------------------------------");
        System.out.println("Esse professor ganha R$25,00 por hora");

        System.out.print("Quantidade de aulas lecionadas na semana: ");
        int aulas = teclado.nextInt();
        System.out.println("------------------------------------");
        float salarioBruto = ((25 * aulas) * 4) * 1.10f;
        System.out.println("Salario bruto do mes: R$" + salarioBruto);

        System.out.println("------------------------------------");

        float desconto = salarioBruto * 0.17f;
       
        float salarioLiquido = salarioBruto - desconto;

        System.out.println("Desconto IR (5%) + INSS (7%) + ODONTO (5%): R$" + desconto);
        System.out.println("------------------------------------");
        System.out.println("Salario liquido: R$" + salarioLiquido);
    }
}