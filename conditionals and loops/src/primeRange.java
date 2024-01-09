import java.util.Scanner;

public class primeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        checkPrimeRange(a, b);
        sc.close();
    }

    static void checkPrimeRange(int num1, int num2) {
        int count = 0;
        System.out.println("prime numbers");
        for (int i = num1; i <= num2; i++) {
            int temp = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    temp = 1;
                    break;
                }
            }
            if (temp == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("total prime number: " + count);
    }
}
