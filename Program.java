import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //Leap year or non-leap year:
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the year: ");
      int year = sc.nextInt();

      if(year %400==0 && year %100==0){
        System.out.println("Leap year");
      }
      else if(year%100!=0 && year %4==0){
        System.out.println("Leap year");
      }
      else{
        System.out.println("Non-leap year");
      }
    }
}