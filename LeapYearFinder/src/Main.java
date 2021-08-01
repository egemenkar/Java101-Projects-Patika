import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, remainder;
        boolean isLeap = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = input.nextInt();
        if(year%100 == 0) {
            if(year%400 == 0) {
                isLeap = true;
            } else {
                isLeap = false;
            }
        } else if(year%4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        if(isLeap) {
            System.out.print(year + " is a leap year.");
        } else {
            System.out.print(year + " is not a leap year.");
        }
    }
}
