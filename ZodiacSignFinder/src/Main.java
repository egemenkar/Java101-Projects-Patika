import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String zodiac = "";
        int day, month;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth day: ");
        day = input.nextInt();
        System.out.print("Enter your birth month: ");
        month = input.nextInt();

        if (month == 1) {
            if (day >0 && day < 20) {
                zodiac = "Capricorn";
            } else if (day >= 20 && day <=31) {
                zodiac = "Aquarius";
            } else {
                isError = true;
            }
        }

        if (month == 2) {
            if (day >0 && day < 20) {
                zodiac = "Aquarius";
            } else if (day >= 20 && day <=29) {
                zodiac = "Pisces";
            } else {
                isError = true;
            }
        }

        if (month == 3) {
            if (day >0 && day < 21) {
                zodiac = "Pisces";
            } else if (day >= 21 && day <=31) {
                zodiac = "Aries";
            } else {
                isError = true;
            }
        }

        if (month == 4) {
            if (day >0 && day < 21) {
                zodiac = "Aries";
            } else if (day >= 21 && day <=30) {
                zodiac = "Taurus";
            } else {
                isError = true;
            }
        }

        if (month == 5) {
            if (day >0 && day < 21) {
                zodiac = "Taurus";
            } else if (day >= 21 && day <=31) {
                zodiac = "Gemini";
            } else {
                isError = true;
            }
        }

        if (month == 6) {
            if (day >0 && day < 21) {
                zodiac = "Gemini";
            } else if (day >= 21 && day <=30) {
                zodiac = "Cancer";
            } else {
                isError = true;
            }
        }

        if (month == 7) {
            if (day >0 && day < 23) {
                zodiac = "Cancer";
            } else if (day >= 23 && day <=31) {
                zodiac = "Leo";
            } else {
                isError = true;
            }
        }

        if (month == 8) {
            if (day >0 && day < 23) {
                zodiac = "Leo";
            } else if (day >= 23 && day <=31) {
                zodiac = "Virgo";
            } else {
                isError = true;
            }
        }

        if (month == 9) {
            if (day >0 && day < 23) {
                zodiac = "Virgo";
            } else if (day >= 23 && day <=30) {
                zodiac = "Libra";
            } else {
                isError = true;
            }
        }

        if (month == 10) {
            if (day >0 && day < 23) {
                zodiac = "Libra";
            } else if (day >= 23 && day <=31) {
                zodiac = "Scorpio";
            } else {
                isError = true;
            }
        }

        if (month == 11) {
            if (day >0 && day < 23) {
                zodiac = "Scorpio";
            } else if (day >= 23 && day <=30) {
                zodiac = "Sagittarius";
            } else {
                isError = true;
            }
        }

        if (month == 12) {
            if (day >0 && day < 22) {
                zodiac = "Sagittarius";
            } else if (day >= 22 && day <=31) {
                zodiac = "Capricorn";
            } else {
                isError = true;
            }
        }

        if (isError) {
            System.out.print("You've entered a wrong value!");
        } else {
            System.out.print("Your zodiac sign is: " + zodiac);
        }

    }
}
