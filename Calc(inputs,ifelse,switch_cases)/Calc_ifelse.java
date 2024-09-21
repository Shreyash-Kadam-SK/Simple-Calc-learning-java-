import java.util.Scanner;

public class Calc_Ifelse
  {
    public static void main (String[]args)
      {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number:");
        Double num1 = input.nextDouble();
        System.out.print("Enter your second number:");
        Double num2 = input.nextDouble();
        System.out.print("What operation do you want to do? :");
        String operation = input.nextLine();

        if (operation.equals("sum"))
        {
          System.out.printf("%f + %f = %f",num1,num2,num1+num2);
        }
        else if (operation.equals("sub"))
        {
          System.out.printf("%f - %f = %f",num1,num2,num1-num2);
        }
        else if (operation.equals("mul"))
        {
          System.out.printf("%f * %f = %f",num1,num2,num1*num2);
        }
        else if (operation.equals("div"))
        {
          if (num2 == 0)
          {
            System.out.print("Cannot divide by zero");
          }
          else
          {
            System.out.printf("%f / %f = %f",num1,num2,num1/num2);
          }
        }
        else
        {
          System.out.printf("%s operation is not supported",operation);
        }
        input.close();
      }
  }

  
