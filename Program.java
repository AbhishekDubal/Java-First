import java.util.Scanner;
class Program {
  public static void main(String[] args) {
    //Armstrong Number(like 153):

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int Number = sc.nextInt();

    int temp = Number;
    int sum =0;

    while(Number>0){
      int rem = Number%10;
      sum = sum+rem*rem*rem;
      Number = Number/10;
    }

    if(sum == temp){
      System.out.println("The number "+temp+" is Palindrome!");
    }
    else{
      System.out.println("The number "+temp+" is Non-Palindrome!");
    }
  }
}