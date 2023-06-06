import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //Find the factors of given Number:
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number: ");

      int Number = sc.nextInt();

      for(int i=1; i<=Number;i++){
        if(Number%i==0){
          System.out.print(i+" ");
        }
      }
    }
}