import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a year");
        int year = sc.nextInt();

        int yr = year % 400;

        if (yr % 4 == 0) {
            System.out.println("leap");
        } else
            System.out.println("not leap");
        sc.close();
    }
}
