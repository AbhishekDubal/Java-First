import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //Sum of all digits in the given Number:
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number: ");

      int Number = sc.nextInt();
      int sum=0;

      while(Number>0){
        int rem = Number%10;
        sum=sum+rem;
        Number = Number/10;
      }
      System.out.print(sum);
    }
}