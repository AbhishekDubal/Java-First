import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //Print Multiplication Table of Given Number:
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Number: ");
      int Number = sc.nextInt();

      for (int i = 1; i <=10; i++) {
        System.out.println(Number+"*"+i+"="+Number*i);
      }
    }
}