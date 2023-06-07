import java.util.Scanner;
class Program {
  public static void main(String[] args) {
    //Prime Number(the number divides with itself and by 1):

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int Number = sc.nextInt();

    int count=0;
    for(int i=1; i<=Number; i++){
      if(Number%i==0){
        count++;
      }
    }
    if(count==2){
      System.out.println("Yes! "+Number+" is Palindrome.");
    }
    else{
      System.out.println("No! "+Number+" is Non-Palindrome.");
    }
  }
}