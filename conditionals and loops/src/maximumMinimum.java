import java.util.Scanner;

public class maximumMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = maximum(a, b, c);
        int min = minimum(a, b, c);

        System.out.println("maximum: " + max + "    minimum: " + min);
        sc.close();
    }

    static int maximum(int num1, int num2, int num3) {
        int max = num1;
        if (max < num2)
            max = num2;
        if (max < num3)
            max = num3;
        return max;
    }

    static int minimum(int num1, int num2, int num3) {
        int min = num1;
        if (min > num2)
            min = num2;
        if (min > num3)
            min = num3;
        return min;
    }
}
