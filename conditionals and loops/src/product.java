import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = productOfNum(a, b);
        System.out.println("product: " + res);
        sc.close();
    }

    static int productOfNum(int a, int b) {
        return a * b;
    }
}
