import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1: ");
        int a = sc.nextInt();
        System.out.println("Enter num 2: ");
        int b = sc.nextInt();
        System.out.println("Enter num 3: ");
        int c = sc.nextInt();
        /*
         * int max = a;
         * if (b > max)
         * max = b;
         * if (c > max)
         * max = c;
         * 
         */
        int max = 0;
        if (a > b)
            max = a;
        else
            max = b;
        if (c > max)
            max = c;
        System.out.println("Largest Number : " + max);
        sc.close();
    }
}