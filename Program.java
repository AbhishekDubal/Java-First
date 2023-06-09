import java.util.Scanner;
class Program{
  public static void main(String[] args) {
    //Sort the array elements in Ascending order:

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of array: ");

    int size = sc.nextInt();

    int array[] = new int[size];

    System.out.println("Enter the elements: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextInt();
    }

    System.out.println("The elements that you've entered: ");

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]+" ");
    }

    System.out.println("\nAfter Sorting the array elements in Ascending order: ");

    for (int i = 0; i < array.length; i++) {
      for (int j = i+1; j < array.length; j++) {
        if(array[i] > array[j]){
          int temp= array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
      System.out.print(array[i]+" ");

    }

  }
}