import java.util.Scanner;
class Program {
  public static void main(String[] args) {
  
    //print sum of array elements :
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of array: ");
    int size = sc.nextInt();

    int array [] =new int [size];
  
    System.out.println("Enter the elements: ");
    for(int i= 0; i<array.length;i++){
       array[i]=sc.nextInt();
    }

    System.out.println("The elements that you've entered in order: ");
    for(int i= 0; i<array.length;i++){
      System.out.print(array[i]+" ");
    }

    int sum =0;
    for (int i = array.length-1; i >=0; i--) {
      sum = sum + array[i];
    }

    System.out.print("\n The sum of array elements: "+sum);
  }
}