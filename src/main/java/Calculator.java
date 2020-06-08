import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        boolean repeat = true;
        while (repeat) {

            int num1;
            int num2;
            int answer = 0;
            String operation;
            System.out.println("Enter a number!");
            Scanner input = new Scanner(System.in);
            num1 = input.nextInt();
            System.out.println("Enter a number!");
            Scanner input2 = new Scanner(System.in);
            num2 = input2.nextInt();
            System.out.println("Enter operation'+' '-' 'x '/' '*'");

            Scanner op = new Scanner(System.in);
            operation = op.next();

            if (operation.equals("+")) {
                System.out.println(answer = add(num1, num2));
            } else if (operation.equals("-")) {
                System.out.println(answer = subtract(num1, num2));
            } else if (operation.equals("x")) {
                System.out.println(answer = multiply(num1, num2));
            } else if (operation.equals("/")) {
                System.out.println(answer = divide(num1, num2));
            } else if (operation.equals("*")) {
                System.out.println(power(num1, num2));
            } else {
                System.out.println("Illegal Operation");
            }
            System.out.println(num1 + operation + num2 + " equals to " + answer);

            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to continue? (yes or no)");
            String reply = scan.nextLine();
            if (reply.equals("no"))
                repeat = false;
        }
        }




    public static int add (int x, int y){
        int result = x + y;
        return result;
    }
    public static int subtract ( int x, int y){
        int result = x - y;
        return result;
    }

    public static int multiply (int x, int y){
        int result = x * y;
        return result;
    }

    public static int divide (int x, int y){
        int result = x / y;
        return result;
    }

    public static int power (int x, int y){
        int result = (int) Math.pow(x,y);
        return result;
    }
}
