import java.util.Scanner;

public class comission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comission = 0;

        System.out.print("Enter total sale: ");
        int sale = sc.nextInt();

        if (sale > 0 && sale <= 20000)
            comission = sale * 3 / 100;
        else if (sale > 20000 && sale <= 50000)
            comission = sale * 12 / 100;
        else
            comission = sale * 31 / 100;

        System.out.println("comission: " + comission);
        sc.close();
    }
}
