import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //Area of Tri-Angle:
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the each sides: ");
      
      int a =sc.nextInt();
      int b =sc.nextInt();
      int c =sc.nextInt();

      double sp = (a+b+c)/2;

      double Area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));

      System.out.println("The Area of Tra-angle is: "+Area);
    }
}