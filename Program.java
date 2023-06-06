import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //Check whether the number is divisible by 8:
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number: ");

      int Number = sc.nextInt();

      if(Number%8==0){
        System.out.println("Number is divisible by 8.");
      }
      else{
        System.out.println("Number is Not divisible by 8.");
      }

    }
}