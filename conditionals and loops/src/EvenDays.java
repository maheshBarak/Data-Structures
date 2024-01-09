import java.util.Scanner;

public class EvenDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a month");
        String month = sc.next();
        System.out.println("enter a year");
        int year = sc.nextInt();

        switch (month) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("15 even day, 16 odd days");
                break;
            case "febuary":
                year = year / 100;
                if (year % 4 == 0)
                    System.out.println("leap year. 14 even day, 15 odd days");
                else
                    System.out.println("Not a leap year. 14 even day, 14 odd days");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("15 even day, 16 odd days");
                break;
            default:
                System.out.println("enter a valid month and year");
        }
        sc.close();
    }
}
