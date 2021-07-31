import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int mat, fizik, tarih, turkce, kimya, muzik, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        toplam = (mat + fizik + tarih + turkce + kimya + muzik);

        double sonuc = toplam / 6;

        System.out.println("Not Ortalamanız: " + sonuc);

        System.out.println(sonuc < 60 ? "Sınıfta Kaldı" : "Sınıfı Geçti" );


    }
}
