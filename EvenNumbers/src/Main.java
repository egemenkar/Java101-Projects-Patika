import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, i = 1, average, totalNum = 0, countNum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        k = input.nextInt();

        while(i <= k) {
            if(i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                totalNum += i;
                countNum++;
            }
            i++;
        }
        average = totalNum / countNum;
        System.out.println("The average of numbers up to " + k + " divisible by 3 and 4 is => " + average);
    }
}
