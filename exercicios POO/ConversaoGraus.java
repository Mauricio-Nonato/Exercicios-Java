public class ConversaoGraus {
    public static void main(String[] args) {
        System.out.println("Celsius -> Fahrenheit");
        for (int c = 10; c <= 100; c += 10) {
            double f = (c * 9.0/5) + 32;
            System.out.println(c + "°C -> " + f + "°F");
        }
    }
}
