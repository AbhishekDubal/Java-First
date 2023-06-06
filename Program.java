import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //print all odd or even numbers between the Number that have been given.
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Number: ");
      int Number = sc.nextInt();

      if(Number % 2 == 0){
        for(int i = 0; i<= Number; i=i+2){
          System.out.print(i+" ");
        }
      }
      else{
        for(int i=1; i<=Number; i=i+2){
          System.out.print(i+" ");
        }
      }
    }
}