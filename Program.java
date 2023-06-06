import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //calculate the power of given Number:
      Scanner sc= new Scanner(System.in);

      System.out.print("Enter the Number: ");
      int Number = sc.nextInt();
      
      System.out.print("ENter the POWER: ");
      int POWER = sc.nextInt();

      int result = 1;
      
      for (int i = 1; i <= POWER; i++) {
        result = result * Number;
      }
      System.out.print("The result of Number "+Number+" of power "+POWER+" is "+result);
    }
}