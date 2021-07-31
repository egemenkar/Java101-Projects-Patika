
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double toplam, mesafe, tarife = 2.20, sabitFiyat = 10.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Gidilen Mesafe (KM): ");

        mesafe = input.nextDouble();

        toplam = 10.0 + 2.20*mesafe;

        toplam = toplam > 20 ? toplam : 20;

        System.out.println("Toplam Borcunuz: " + toplam);
    }
}
