import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //Reverse the given Number:
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number: ");

      int Number = sc.nextInt();

      while(Number>0){
        int rem = Number%10;
        System.out.print(rem);
        Number=Number/10;
      }
    }
}