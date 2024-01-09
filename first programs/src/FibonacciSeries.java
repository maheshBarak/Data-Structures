import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value : ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;

        for(int i=2;i<=num;i++){
            System.out.print(a+" ");
            System.out.print(b+" ");
            int c=a+b;
            System.out.print(c+" ");
            a=b+c;
            b=a+c;
        }
    }
}
