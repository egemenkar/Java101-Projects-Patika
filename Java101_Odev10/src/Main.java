import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int mat, fizik, turkce, kimya, muzik, toplam;
        int a,b,c,d,e;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if(mat >=0 && mat <=100) { a = 1; } else { a = 0; mat = 0;}

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if(fizik >=0 && fizik <=100) { b = 1; } else { b = 0; fizik = 0;}

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if(turkce >=0 && turkce <=100) { c = 1; } else { c = 0; turkce = 0;}

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if(kimya >=0 && kimya <=100) { d = 1; } else { d = 0; kimya = 0;}

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if(muzik >=0 && muzik <=100) { e = 1; } else { e = 0; muzik = 0;}

        toplam = (mat + fizik + turkce + kimya + muzik);

        double sonuc = toplam / (a + b + c + d + e);


        if(sonuc <55) {
            System.out.println("Maalesef sınıfta kaldınız!");
        } else {
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }
        System.out.println("Not Ortalamanız: " + sonuc);
    }
}
