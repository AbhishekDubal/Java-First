import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //print character from user input

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Character: ");
      char character =  sc.next().charAt(0);

      if(character == 'A' || character == 'E' ||character == 'I' ||character == 'O' ||character == 'U'){
        System.out.print(character+" is Vowel!");
      }
      else{
        System.out.print(character+" is Consonant!");
      }
    }
}