import java.util.Scanner;

class Program{
  public static void main(String[] args) {
    //Multi Dimenetional array
    int array[][] = new int[4][4];

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array elements: ");

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        array[i][j] = sc.nextInt();
      }
      System.out.println();
    }

    System.out.println("The elements that you've entered are: ");

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        System.out.print(array[i][j]+" ");
      }
      System.out.println();
    }
  }
}