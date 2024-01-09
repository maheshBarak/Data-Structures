import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int a = sc.nextInt();
        int factorial = 1;

        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + a + ": " + factorial);
        sc.close();
    }
}
