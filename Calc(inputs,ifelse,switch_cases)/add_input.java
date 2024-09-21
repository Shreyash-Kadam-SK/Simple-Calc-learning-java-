import java.util.Scanner;

public class add_input
  {
    public static void main (String[]args)
      {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number:");
        Double num1 = input.nextDouble();
        System.out.print("Enter your second number:");
        Double num2 = input.nextDouble();
        System.out.printf("%f + %f = %f",num1,num2,num1+num2);
        
        input.close();
      }
  }
  
