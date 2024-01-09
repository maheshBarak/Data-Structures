import java.util.Scanner;

public class averageOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        float sum = 0;

        while (true) {
            System.out.println("enter number");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sum = sum + num;
                i++;
            } else
                break;
        }

        float average = sum / i;

        System.out.println("Average: " + average);
        sc.close();
    }
}
