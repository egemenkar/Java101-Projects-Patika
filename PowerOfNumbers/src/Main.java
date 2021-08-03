import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, count4 = 0, count5 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to determine the limit: ");
        num = input.nextInt();
        System.out.println("----------------------------------");
        for (int i = 1; i <= num; i *= 4) {
            System.out.println("4 to the power of " + count4 + " is: " + i);
            count4++;
        }
        System.out.println("----------------------------------");
        for (int j = 1; j <= num; j *= 5) {
            System.out.println("5 to the power of " + count5 + " is: " + j);
            count5++;
        }
        System.out.println("----------------------------------");
    }
}
