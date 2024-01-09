import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        while (true) {
            result = 0;
            System.out.print("Enter operand: ");
            char operand = sc.next().trim().charAt(0);

            if (operand == '+' || operand == '-' || operand == '*' || operand == '/' || operand == '%') {

                System.out.println("Enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (operand == '+')
                    result = a + b;
                if (operand == '-')
                    result = a - b;
                if (operand == '*')
                    result = a * b;
                if (operand == '/')
                    result = a / b;
                if (operand == '%')
                    result = a % b;
            } else if (operand == 'x' || operand == 'X') {
                break; // ------------------------------------ LOOP WILL BREAK
            } else
                System.out.println("Invalid operation"); // ------------------ LOOP WILL CONTINUE

            System.out.println("result: " + result);
        }
        sc.close();
    }
}
