import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double boy, kilo, vki;
        String durum;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy);

        durum = vki < 18.5 ? "Zayıf" : vki >=18.5 && vki <25 ? "Normal" : vki >=25 && vki <30 ? "Kilolu" : "Obez";

        System.out.print("Vücut Kitle İndeksiniz : " + Math.round(vki*100.0)/100.0 + " (" + durum + ")");

    }
}
