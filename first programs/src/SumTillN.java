import java.util.Scanner;

public class SumTillN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0;
        int num = 'x';

        System.out.print("Enter number: "+num);
        int n =input.nextInt();
        while(num != n){
            n = input.nextInt();
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
