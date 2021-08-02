import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, num, totalNum = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if(num % 4 == 0 || num % 2 == 0) {
               totalNum += num;
            }
        } while (num % 2 != 1);
        System.out.print("Total of numbers: " + totalNum);
    }
}
