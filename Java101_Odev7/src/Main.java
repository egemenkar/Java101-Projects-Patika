import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam, kilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        kilo = input.nextDouble();
        armut = armut * kilo;
        System.out.print("Elma Kaç Kilo? : ");
        kilo = input.nextDouble();
        elma = elma * kilo;
        System.out.print("Domates Kaç Kilo? : ");
        kilo = input.nextDouble();
        domates = domates * kilo;
        System.out.print("Muz Kaç Kilo? : ");
        kilo = input.nextDouble();
        muz = muz * kilo;
        System.out.print("Patlıcan Kaç Kilo? : ");
        kilo = input.nextDouble();
        patlican = patlican * kilo;

        toplam = armut + elma + domates + muz + patlican;
        System.out.print("Toplam Tutar : " + toplam + " TL");

    }

}
