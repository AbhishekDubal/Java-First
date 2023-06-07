import java.util.Scanner;
class Program {
  public static void main(String[] args) {
    //Perfect Number(the sum of numbers that divides with the Number given ):

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int Number = sc.nextInt();

    int sum=0;
    for(int i=1; i<Number;i++){
      if(Number%i==0){
        sum = sum+i;
      }
    }
    if(sum==Number){
      System.out.println("The Number "+Number+" is Perfect Number.");
    }
    else{
      System.out.println("The Number "+Number+" is Non-Perfect Number.");
    }
  }
}