import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen seçim yapınız: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Sonuç: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Sonuç: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Sonuç: " + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.print("Bir tam sayı sıfıra bölünemez!");
                        break;
                    default:
                        System.out.print("Sonuç: " + (n1 / n2));
                }
                break;
            default:
                System.out.print("Yanlış değer girdiniz!");
        }
    }
}
