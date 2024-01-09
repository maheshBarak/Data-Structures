import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter INR Value : ");
        float inr = input.nextFloat();
        float usd = 0.012f * inr;

        System.out.println( inr+" INR = "+usd+" USD");
    }
}
