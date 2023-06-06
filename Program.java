import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //calculate the factorial of given Number:
      Scanner sc= new Scanner(System.in); 
      System.out.print("Enter the Number: ");
      int Number = sc.nextInt();

      int result = 1;
      for (int i = Number; i >= 1; i--) {
        result = i*result;
      }
      System.out.print("The factorial of "+Number+" is "+result);
    }
}