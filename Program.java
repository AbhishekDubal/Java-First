import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
       //Decision Making Statements:(Conditional Statements)
       Scanner sc =new Scanner(System.in);
       System.out.print("ENter your age: ");
        int age =sc.nextInt();
       if(age>=18)
       {
        System.out.println("Yes! you can Vote...!");
       }
       else if(age<0)
       {
        System.out.println("Oops! You got to born first.!");
       }
       else
       {
        System.out.println("Sorry! Only 18 or more than that age group of people can Vote!");
       }
    }
}