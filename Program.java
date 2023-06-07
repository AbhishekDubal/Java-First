import java.util.Scanner;
class Program {
  public static void main(String[] args) {
    //Prime Numbers between Two given Numbers:

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the 1st Number: ");
    int Number1 = sc.nextInt();

    System.out.println("Enter the 2nd Number: ");
    int Number2 = sc.nextInt();

    for(int i=Number1;i<=Number2; i++){
      int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
          count++;
        }
      }
      if(count==2){
        System.out.print(i+" ");
      }
    }
  }
}