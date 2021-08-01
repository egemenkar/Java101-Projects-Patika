import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, tripType;
        double price = 0.1, ageDiscount, ageDiscountRate = 0, tripDiscount, tripDiscountRate = 0, totalPrice, discountedPrice, finalPrice, totalDiscounts;

        Scanner input = new Scanner(System.in);
        System.out.print("Flying Distance in (KM): ");
        distance = input.nextInt();
        System.out.print("Age: ");
        age = input.nextInt();
        System.out.print("Trip Type (One-Way => 1, Return =>2) : ");
        tripType = input.nextInt();

        if((distance < 0) || (age < 0) || (tripType < 1 && tripType > 2)) {
            System.out.print("Wrong value!");
        } else {
            if(age < 12) {
                ageDiscountRate = 0.50;
            } else if(age >= 12 && age <= 24) {
                ageDiscountRate = 0.10;
            } else if(age >= 65) {
                ageDiscountRate = 0.30;
            } else {
                ageDiscountRate = 0;
            }

            if(tripType == 2) {
                tripDiscountRate = 0.2;
            } else {
                tripDiscountRate = 0;
            }
        }

        totalPrice = distance * price;
        System.out.println("Total Price (Without Discounts) : " + Math.round(totalPrice*100.0)/100.0 + " TL");
        ageDiscount = totalPrice * ageDiscountRate;
        discountedPrice = totalPrice - ageDiscount;
        tripDiscount = discountedPrice * tripDiscountRate;
        finalPrice = discountedPrice - tripDiscount;
        totalDiscounts = totalPrice - finalPrice;
        System.out.println("Total Discounts: " + Math.round(totalDiscounts*100.0)/100.0 + " TL");
        System.out.print("Final Price: " + Math.round(finalPrice*100.0)/100.0 + " TL");

    }
}
