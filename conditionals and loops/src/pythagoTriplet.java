//  Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class pythagoTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(checkPythagoreanTriple(a, b, c));
        sc.close();
    }

    static boolean checkPythagoreanTriple(int a, int b, int c) {
        return (a * a + b * b == c * c);
    }
}