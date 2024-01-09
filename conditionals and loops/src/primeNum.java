import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();

        checkPrime(a);
        sc.close();
    }

    static void checkPrime(int num) {
        int temp = 0;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                temp = 1;
                break;
            }
        }
        if (temp == 0)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
