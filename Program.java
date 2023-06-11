import java.util.Scanner;
class Program{
  public static void main(String[] args) {
    //Delete the element from the array:

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array: ");
    int size = sc.nextInt();

    int array[] = new int [size];

    System.out.print("Enter the array elements in array: ");
    for (int i = 0; i < size; i++) {
      array[i]  = sc.nextInt();
    }

    System.out.println("The elements that you've eneterd now: ");
    for (int i = 0; i < size; i++) {
      System.out.print(" "+array[i]);
    }

    System.out.println("\nNow... What do you want to delete : ");
    int location = sc.nextInt();
    
    for (int i = location; i < array.length -1; i++) {
      array[i] = array[i+1];
          System.out.print(array[i]+" ");
    }

  }
}