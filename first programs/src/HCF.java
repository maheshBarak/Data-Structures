import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter Value 2: ");
        int num2 = input.nextInt();

        int n1 = num1;
        int n2 = num2;


            while(num1%num2!=0){
                int n3 = num1%num2;
                    num1=num2;
                    num2=n3;
            }
            System.out.println("HCF "+num2);

        int lcm =(n1*n2)/num2;
        System.out.println("LCM "+lcm);
    }
}
