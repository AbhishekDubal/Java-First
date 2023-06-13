import java.util.Scanner;
class Program{
  public static void main(String[] args) {
    //Fibonacci

    int num1=0;
    int num2=1;
    int num3;

    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the range: ");
    int range = sc.nextInt();

      System.out.print(num1+" "+num2);
    for(int i=1; i<= range;i++){     
      num3= num1+num2;
      System.out.print(" "+num3);
      num1 = num2;
      num2 = num3;
    }
  }
}