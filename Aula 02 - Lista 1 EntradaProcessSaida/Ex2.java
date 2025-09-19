/* 
* Q2 – CALCULAR A QUANTIDADE DE DIAS VIVIDOS – Crie uma aplicação console que 
* solicite do usuário o ano de nascimento e o ano atual, baseado nestas duas 
* informações exibida a quantidade de dias vividos até o momento, considere 
* que cada ano contém 365 dias.
*/
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o ano de nascimento: ");
        int nascimento = scanner.nextInt();

        System.out.print("Informe o ano atual: ");
        int atual = scanner.nextInt();

        int diasVividos = (atual - nascimento) * 365;

        System.out.println("Você viveu aproximadamente " + diasVividos + " dias.");

        scanner.close();
    }
}
