import java.util.Scanner;

public class factorialUsingFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(findFactorial(a));
        sc.close();
    }

    static long findFactorial(int num) {
        /*
         * long facto = 1;
         * for (int i = 1; i <= num; i++) {
         * facto = facto * i;
         * }
         * return facto;
         */

        if (num == 0 || num == 1)
            return 1;
        return (num * findFactorial(num - 1));
    }
}
