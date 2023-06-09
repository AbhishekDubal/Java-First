import java.util.Arrays;
import java.util.Scanner;
class Program {
  public static void main(String[] args) {
  
    //print array elements in reverse order:
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of array: ");
    int size = sc.nextInt();

    int array [] =new int [size];
  
    System.out.println("Enter the elements: ");
    for(int i= 0; i<array.length;i++){
       array[i]=sc.nextInt();
    }

    System.out.println("The elements in Proper order: ");
    for(int i= 0; i<array.length;i++){
      System.out.print(array[i]+" ");
    }

    // System.out.println();
    System.out.println("\nThe elements in Reverse order: ");

    for (int i = array.length-1; i >=0; i--) {
      System.out.print(array[i]+" ");
    }
 
  }
}