public class FatoriaisImpares {
    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        long soma = 0;
        int contador = 0;

        for (int i = 1; i <= 20; i += 2) { // números ímpares
            soma += fatorial(i);
            contador++;
        }

        System.out.println("Soma dos fatoriais ímpares: " + soma + ", Quantidade de ímpares: " + contador);
    }
}
