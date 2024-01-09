import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int yr = input.nextInt();

        if(yr % 400 == 0){
            System.out.println(yr+" is a leap year.");
        } else if (yr % 4 == 0 ) {
            System.out.println(yr+" is a leap year.");
        }
        else {
            System.out.println(yr+" is not a leap year.");
        }
    }
}
