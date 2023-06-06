import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //calculate the Number of digits in given Number:
      
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the Number: ");
      int Number = sc.nextInt();

      int count = 0;
      while(Number>0){
        Number = Number/10;
        count++;
      }
      System.out.println("The Number "+Number+" is having "+count+" of digits!");
    }
}