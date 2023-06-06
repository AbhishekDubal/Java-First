import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //check the given Number is Palindrome or Not:
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Number that you want to check whether it is Palindrome: ");

      int Number = sc.nextInt();
      
      int temp= Number;
      int sum=0;
      while(Number>0){
        int rem = Number%10;
        sum=rem+(sum*10);
        Number = Number/10;       
      }
      if(sum==temp){
        System.out.println("Number "+temp+" is Palindrome!");
      }
      else{
        System.out.println("Number is NOT-Palindrome!");
      }
    }
}