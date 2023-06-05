import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
       //Decision Making Statements:(Conditional Statements)
       Scanner sc =new Scanner(System.in);
       System.out.print("ENter you a: ");
        int a =sc.nextInt();
        System.out.print("ENter you b: ");
        int b =sc.nextInt();
        System.out.print("ENter you c: ");
        int c =sc.nextInt();
       if(a>b)
       {
        if(a>c)
        {
            System.out.println(a+" is biggest number");
        }
        else
        {
            System.out.println(c+" is biggest number");
        }
       }
       else if(b>c)
       {
        System.out.println(b+" is biggest number");
       }
       else
       {
        System.out.println(c+" is biggest number");
       }
    }
}