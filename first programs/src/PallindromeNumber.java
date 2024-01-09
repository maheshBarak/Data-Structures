import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value : ");

        int num = input.nextInt();
        int reverse=0;
        int numCopy = num;

        while(numCopy >0){
            int unitDigit = numCopy%10;
            reverse = reverse*10+unitDigit;
            numCopy = numCopy/10;
        }
        if(reverse == num){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}
