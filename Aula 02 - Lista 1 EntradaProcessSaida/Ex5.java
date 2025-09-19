/*
* Q5 – INFORMAÇÕES SALARIAIS – Crie uma aplicação que forneça várias informações
* salariais referente ao salário de um determinado professor que ganha R$ 25,00
* por hora/aula. A aplicação criada deverá: a) Solicitar qual a quantidade de
* aulas semanais que o professor leciona; b) Deverá apresentar o salário bruto
* mensal, considerando que o mês é composto por 4 semanas e que o professor tem
* um acréscimo de 10% (referente ao vale alimentação, vale transporte e plano 
* de saúde). c) Deverá apresentar os valores descontados em folha de pagamento,
* que são 5% de IR e 7% de INSS. d) Deverá apresentar o valor do salário líquido
* do professor (salário bruto menos os descontos).
*/
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorHora = 25.00;

        System.out.print("Informe a quantidade de aulas semanais: ");
        int aulasSemanais = scanner.nextInt();

        double salarioBase = aulasSemanais * valorHora * 4;
        double salarioBruto = salarioBase * 1.10; // 10% de acréscimos

        double descontoIR = salarioBruto * 0.05;
        double descontoINSS = salarioBruto * 0.07;
        double salarioLiquido = salarioBruto - descontoIR - descontoINSS;

        System.out.printf("Salário bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Desconto IR (5%%): R$ %.2f\n", descontoIR);
        System.out.printf("Desconto INSS (7%%): R$ %.2f\n", descontoINSS);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);

        scanner.close();
    }
}
