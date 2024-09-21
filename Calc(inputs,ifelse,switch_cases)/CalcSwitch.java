import java.util.Scanner;

public class CalcSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        double num1 = input.nextDouble();
        input.nextLine();
        System.out.print("Enter your second number: ");
        double num2 = input.nextDouble();
        input.nextLine();
        System.out.print("What operation do you want to do? (sum/sub/mul/div): ");
        String operation = input.nextLine();

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
                break;
            case "div":
                if (num2 == 0) {
                    System.out.print("Cannot divide by zero");
                } else {
                    System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
                }
                break;
            default:
                System.out.printf("%s operation is not supported", operation);
        }

        input.close();
    }
}

