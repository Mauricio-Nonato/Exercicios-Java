/* APRESENTAR DIVISEIS POR 4 – Crie uma aplicação que exiba todos os números divisíveis por 4 que
estão entre a faixa de valores de 1 a 200.  */

public class Ex06 {
    public static void main(String[] args) {
        System.out.print("Núemros entre 1 e 200 divisiveis por 4: ");
        for (int i = 1; i <= 200; i++) {
            if (i % 4 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
