import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //print ASCII value of given character 

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Character: ");

      char character = sc.next().charAt(0);

      int value = character;
      System.out.print(value);
    }
}