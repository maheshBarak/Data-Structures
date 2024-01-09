import java.util.Scanner;

public class ArmstringNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value : ");

        int num = input.nextInt();
        int powerSum=0;
        int numCopy = num;

        while(numCopy >0){
            int unitDigit = numCopy%10;
            powerSum = (int) (powerSum+Math.pow(unitDigit,3));
            numCopy = numCopy/10;
        }
        if(powerSum == num){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is not Armstrong");
        }
    }
}
