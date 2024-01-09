import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // METHOD- 1
        // System.out.println("enter number");
        // int num = sc.nextInt();
        // int max=num
        /*
         * while (true) {
         * System.out.println("enter another number");
         * num = sc.nextInt();
         * 
         * if (num != 0) {
         * if (max < num)
         * max = num;
         * } else
         * break;
         * }
         * 
         */

        // METHOD- 2

        int max = 0;
        while (true) {
            System.out.println("enter number");
            int num = sc.nextInt();

            if (num != 0) {
                if (max < num)
                    max = num;
            } else
                break;
        }

        // METHOD- 3
        /*
         * while (num != 0) {
         * System.out.println("enter another number");
         * num = sc.nextInt();
         * if (max < num)
         * max = num;
         * }
         * 
         */ System.out.println("largest number: " + max);
        sc.close();
    }
}
