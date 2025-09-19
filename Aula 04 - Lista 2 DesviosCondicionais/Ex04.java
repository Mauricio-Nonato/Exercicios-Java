/* IMC - Crie uma aplicação para realizar o cálculo do IMC, a aplicação deverá solicitar do usuário o Peso
e a Altura, deverá então processar o Índice de Massa Corporal, e com esse valor exibir as mensagens
de acordo com a tabela de classificação de IMC (Pesquise como calcular o IMC). */

import java.util.Scanner;

public class Ex04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double altura, peso, imc;

        System.out.print("Digite sua altura (M): ");
        altura = input.nextDouble();
        System.out.print("Digite seu peso (KG): ");
        peso = input.nextDouble();

        imc = peso/(altura * altura);

        System.out.printf("IMC: %.2f\n" + imc);

        if (imc <= 18.5) {
            System.out.println("Você esta abaixo do imc ideal");
        } else if(imc > 18.5 && imc <= 24.9) {
            System.out.println("Você esta com o imc ideal");
        } else if(imc > 24.9 && imc <= 29.9) {
            System.out.println("Você esta sobrepeso");
        } else {
            System.out.println("Você está obeso");
        }
        input.close();
    }
}
