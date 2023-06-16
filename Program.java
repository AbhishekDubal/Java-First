import java.util.Scanner;
class Program{
  public static void main(String[] args) {
    //Recursion

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");

    int number =sc.nextInt();
    Program p = new Program();
    int total = p.sumOfNumber(number);
    System.out.println("The sum of "+number+" is: "+total);
  }

  int sumOfNumber(int number){
    if(number>0){
      return number+sumOfNumber(number-1);
    }
    else{
      return 0;
    }
  }
}