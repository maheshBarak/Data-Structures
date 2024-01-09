import java.util.Scanner;

public class SimpleInterst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        int p = input.nextInt();
        System.out.println("Enter interest");
        float i = input.nextFloat();
        System.out.println("Enter period");
        float y = input.nextFloat();

        float in = (p*i*y)/100;
        System.out.println("Simple Interst = "+in);
    }
}
