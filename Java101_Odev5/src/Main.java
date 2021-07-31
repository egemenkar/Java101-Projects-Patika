
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, a;
        double dilimAlan, alan, cevre, pi = 3.14;

        System.out.print("Yarıçapı giriniz: ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();

        System.out.print("Daire Dilimi Açısını Giriniz: ");
        a = input.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r;
        dilimAlan = (pi * (r * r) * a) / 360;

        System.out.println("Dairenin Toplam Çevresi: " + cevre);
        System.out.println("Dairenin Toplam Alanı: " + alan);
        System.out.println("Daire Diliminin Alanı: " + dilimAlan);
    }
}
