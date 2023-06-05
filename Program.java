import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
       //Decision Making Statements:(Conditional Statements)
       Scanner sc =new Scanner(System.in);
       System.out.print("ENter your choice: ");
        char choice =sc.next().charAt(0);
       
        int a= 10, b=20;
        switch(choice)
        {
            case '+' : System.out.println("Addition of a and b is = "+(a+b));
            break;

            case '-' : System.out.println("Subtraction of a and b is = "+(a-b));
            break;

            case  '*': System.out.println("Multiple of a and b is = "+(a*b));
            break;

            case  '/': System.out.println("Divison of a and b is = "+(a/b));
            break;

            default : System.out.println("Please choose valid operator");
        }
        
    }
}