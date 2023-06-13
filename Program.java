import java.util.Scanner;
class Program{
  public static void main(String[] args) {
    //Tribonacci

    int num1=0;
    int num2=1;
    int num3 = 2;
    int num4;

    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the range: ");
    int range = sc.nextInt();

    System.out.print(num1 +" "+num2+" "+num3);

    for(int i = 1; i<=range -4;i++){
      num4 = num1+num2+num3;
      System.out.print(" "+num4);
      num1 = num2;
      num2 = num3;
      num3= num4;
    }
  }
}