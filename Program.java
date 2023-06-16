import java.util.Scanner;
class Program{
  public static void main(String[] args) {
    //Recursion (Factorial finding)

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");

    int number =sc.nextInt();
    Program p = new Program();
    int total = p.factOfNumber(number);
    System.out.println("The factorial of "+number+" is: "+total);
  }

  int factOfNumber(int number){
    if(number>0){
      return number*factOfNumber(number-1);
    }
    else{
      return 1;
    }
  }
}