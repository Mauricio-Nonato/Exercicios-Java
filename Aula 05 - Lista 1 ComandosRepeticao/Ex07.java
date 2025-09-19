/* POTÊNCIA – Crie uma aplicação que apresenta o resultado das potências de 3, variando do expoente
0 até o expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é
ele próprio. Deverá ser apresentado, observando a seguinte definição:
3
0 = 1
3
1 = 3
3
2 = 9
(...)
3
15=14348907 */

public class Ex07 {
    
    public static void main(String[] args) {
        int base = 3;
        for (int expoente = 0; expoente <= 15; expoente++) {
            int resultado =(int) Math.pow(base, expoente);
            System.out.printf("%d ^ %d = %d\n", base, expoente, resultado);
        }

        
    }
}
