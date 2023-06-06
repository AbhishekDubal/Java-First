import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //print character from user input

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Character: ");
      char character = sc.next().charAt(0);

      System.out.println(character);
    }
}