import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //Swap Two Numbers:
      
      int person1 = 10;
      int person2 = 20;

      int otherPerson;

      System.out.println("Person1 is having the money of "+person1);
      System.out.println("Person2 is having the money of "+person2);

      
      System.out.println("After the exchange or Swaping: ");
      otherPerson = person1;
      person1 = person2;
      person2 = otherPerson;
      
      System.out.println("Person1 is having the money of "+person1);
      System.out.println("Person2 is having the money of "+person2);
    }
}