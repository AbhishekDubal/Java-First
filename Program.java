import java.util.Scanner;
class Program
{
    public static void main(String args[])
    {
      //character to UpperCase and LowerCase:

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the character: ");

      char character1 = sc.next().charAt(0);

      char character2;
      
      if(character1 >='A' && character1 <='Z'){
        character2 = Character.toLowerCase(character1);
        System.out.println(character2);
      }else{
        character2 = Character.toUpperCase(character1);
        System.out.println(character2);
      }
    
    }
}