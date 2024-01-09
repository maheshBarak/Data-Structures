//  Calculate Distance Between Two Points: x(a,b)  y(c,d)

import java.util.Scanner;

public class twoPointDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y values of Point 1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x and y values of Point 2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        float dis = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("distance " + dis);
        sc.close();
    }
}
