
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdv, kdvOran, fiyat, kdvliFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("KDV hesaplamak için lütfen fiyatı giriniz: ");

        fiyat = input.nextDouble();

        System.out.println(fiyat < 0 ? "Lütfen sıfırdan büyük bir değer giriniz!" : "Hesaplanıyor...");

        if(fiyat > 0) {
            kdvOran = fiyat < 1000 ? 0.18 : 0.08;
            kdv = fiyat * kdvOran;
            kdvliFiyat = fiyat + kdv;
            System.out.println("KDV Oranı: % " + Math.round(kdvOran*100));
            System.out.println("KDV Tutarı: " + Math.round(kdv*100)/100);
            System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        }


    }

}
