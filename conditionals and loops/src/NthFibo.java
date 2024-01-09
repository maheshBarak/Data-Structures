import java.util.Scanner;

public class NthFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 2; i < num; i++) {
            int temp = b;
            b += a;
            a = temp;
        }
        System.out.println(b);
        sc.close();
    }
}
