import java.util.Scanner;

public class SumTillx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value 1: ");
        int i = 1;

        int sum=0;

        while(input.hasNextInt()){
            int num = input.nextInt();
            sum+=num;
            i++;
            System.out.print("enter value "+i+": ");
        }
        System.out.println(sum);
    }
}
