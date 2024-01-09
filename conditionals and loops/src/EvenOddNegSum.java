//  Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers(N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class EvenOddNegSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int negSum = 0;
        int evenSum = 0;
        int oddSum = 0;

        // METHOD - 1
        /*
         * System.out.println("enter number");
         * int num = sc.nextInt();
         * 
         * while (num != 0) {
         * if (num < 0)
         * negSum += num;
         * else if (num % 2 == 0)
         * evenSum += num;
         * else if (num % 2 != 0)
         * oddSum += num;
         * else
         * System.out.println("enter only integer");
         * 
         * System.out.println("enter number");
         * num = sc.nextInt();
         * }
         * 
         */

        // METHOD - 2
        while (true) {
            System.out.println("enter number");
            int num = sc.nextInt();

            if (num == 0)
                break;
            if (num < 0)
                negSum += num;
            else if (num % 2 == 0)
                evenSum += num;
            else if (num % 2 != 0)
                oddSum += num;
        }

        System.out.println("negative sum:" + negSum + "  evensum:" + evenSum + "  oddsum:" + oddSum);
        sc.close();
    }
}
