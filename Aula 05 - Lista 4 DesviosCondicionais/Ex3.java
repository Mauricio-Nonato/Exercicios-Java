/*
 * Q3 CÁLCULO DE NOTA DOS ALUNOS – Crie um programa que deverá solicitar RA,
 * NOTA1, NOTA2 e NOTAPLURI para 3 alunos diferentes. Em posse das informações,
 * o sistema deverá realizar as seguintes ações:
 * a) Calcular a média para cada 
 * um dos alunos, aplicando os seguintes pesos 30% para nota1, 40% para nota2 e 30% 
 * para notapluri. 
 * b) Deverá apresentar o RA e MÉDIA de cada um dos alunos. 
 * c) Deverá apresentar a média geral das notas dos alunos (some as médias calculas e divida por três). 
 * d) Deverá apresentar o RA e a mensagem APROVADO (média >= 7.0) ou REPROVADO (média < 7).
 * e) Deverá exibir uma mensagem informando quantos alunos foram aprovados e quantos foram reprovados. 
 * f) Deverá exibir o RA e MÉDIA ordenados do menor para o maior, para realizar a ordenação considere
 * as médias calculadas
 */

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] RAs = new String[3];
        double[] medias = new double[3];
        int aprovados = 0, reprovados = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("\nDigite o RA do aluno " + (i + 1) + ": ");
            RAs[i] = sc.nextLine();
            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();
            System.out.print("Nota Pluricurricular: ");
            double np = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            medias[i] = (n1 * 0.3) + (n2 * 0.4) + (np * 0.3);
        }

        System.out.println("\nRA e Média de cada aluno:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("RA: %s - Média: %.2f\n", RAs[i], medias[i]);
        }

        // c) Média geral
        double soma = 0;
        for (double m : medias) soma += m;
        double mediaGeral = soma / 3;
        System.out.printf("\nMédia geral da turma: %.2f\n", mediaGeral);

        // d) Aprovado ou reprovado
        for (int i = 0; i < 3; i++) {
            String status = medias[i] >= 7.0 ? "APROVADO" : "REPROVADO";
            if (medias[i] >= 7.0) aprovados++;
            else reprovados++;
            System.out.printf("RA: %s - %s\n", RAs[i], status);
        }

        // e) Quantidade de aprovados/reprovados
        System.out.printf("\nTotal de aprovados: %d\n", aprovados);
        System.out.printf("Total de reprovados: %d\n", reprovados);

        // f) Ordenar por média
        // Criar pares RA-Média
        String[] RAOrdenados = RAs.clone();
        double[] mediasOrdenadas = medias.clone();

        // Bubble Sort
        for (int i = 0; i < mediasOrdenadas.length - 1; i++) {
            for (int j = 0; j < mediasOrdenadas.length - 1 - i; j++) {
                if (mediasOrdenadas[j] > mediasOrdenadas[j + 1]) {
                    // troca médias
                    double tempM = mediasOrdenadas[j];
                    mediasOrdenadas[j] = mediasOrdenadas[j + 1];
                    mediasOrdenadas[j + 1] = tempM;
                    // troca RA
                    String tempRA = RAOrdenados[j];
                    RAOrdenados[j] = RAOrdenados[j + 1];
                    RAOrdenados[j + 1] = tempRA;
                }
            }
        }

        System.out.println("\nRA e Médias ordenadas do menor para o maior:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("RA: %s - Média: %.2f\n", RAOrdenados[i], mediasOrdenadas[i]);
        }

        sc.close();
    }
}
