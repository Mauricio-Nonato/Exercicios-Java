public class Ex3 {
    public static void main(String[] args) {
        long total = 0;
        long graos = 1;

        for (int i = 1; i <= 64; i++) {
            total += graos;
            graos *= 2;
        }

        System.out.println("Total de grãos no tabuleiro: " + total);
    }
}
