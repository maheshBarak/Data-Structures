import java.util.Scanner;

public class votingAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();

        validAge(age);
        sc.close();
    }

    static void validAge(int num) {
        if (num >= 18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
    }

}
