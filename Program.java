class Program
{
    public static void main(String args[])
    {
       //Ternary Operator(? :)#it works like if else conditions
       int x=10, y=20;
       int maximum = (x>y)? x:y;
       System.out.println(maximum);

       int num1 = 5, num2 =2, num3 = 4;
    
       int minimumNumber =  (num1<num2) ? (num1< num3 ? num1: num3) : (num2< num3 ? num2 : num3);

       System.out.println(minimumNumber);
    }
}