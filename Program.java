import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //Swap Two Numbers without 3rd object:
      
      int person1 = 20;
      int person2 = 50;

      System.out.println("Person1 is having the money of "+person1);
      System.out.println("Person2 is having the money of "+person2);

      
      System.out.println("After the exchange or Swaping: ");
      
      person1 = person1+person2; // 20+50=70;
      
      person2= person1 - person2;// 20
      person1 = person1 - person2;//50
      
      System.out.println("Person1 is having the money of "+person1);
      System.out.println("Person2 is having the money of "+person2);
    }
}