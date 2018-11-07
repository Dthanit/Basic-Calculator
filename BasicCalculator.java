import java.util.Scanner;
public class BasicCalculator
{
     
      public static void main(String[] args)
      {  
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter x = ");
          int x = sc.nextInt();
          System.out.print("Enter y = ");
          int y = sc.nextInt();
          add(x,y);
          substract(x,y);
          multiply(x,y);
          divide(x,y);
      }
      static int add(int x,int y)
      { 
          int Add = x+y;
          System.out.println("Result of Add is "+Add);
          return Add;
      }
      static int  substract(int x,int y)
      {
          int Substract = x-y;
          System.out.println("Result of Substract is "+Substract);
          return Substract;
      }
      static int multiply(int x,int y)
      {
          int Multiply = x*y;
          System.out.println("Result of Multiply is "+Multiply);
          return Multiply;
      }
      static int divide(int x,int y)
      {
          int Divide = x/y;
          System.out.println("Result of Divide is "+Divide);
          return Divide;
      }
}
