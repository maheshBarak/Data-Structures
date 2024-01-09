import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter Value 2: ");
        int num2 = input.nextInt();

        int i, lcm;
        int large = num1>num2?num1:num2;
        for(i=large; i<num1*num2 ; i+=large){
            if(large%num1==0 & large%num2==0) {
                break;
            }
        }
        lcm=i;
        System.out.println("LCM "+lcm);

        int hcf = (num1*num2)/lcm;
        System.out.println("HCF "+hcf);
    }
}
