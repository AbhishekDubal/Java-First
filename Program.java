import java.util.Scanner;
class Program{
  public static void main(String[] args) {
    //Find the biggest element is the array:

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array: ");
    int size = sc.nextInt();

    System.out.print("Enter the array elements in array: ");
    int array[] = new int [size];

    for (int i = 0; i < array.length; i++) {
      array[i]  = sc.nextInt();
    }

    System.out.print("The elements that you've eneterd now: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(" "+array[i]);
    }

    System.out.println();
    for (int i = 0; i < array.length; i++) {
      for (int j = i+1; j < array.length; j++) {
        if(array[i] < array[j]){
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    System.out.print("So the biggest element is: "+array[0]);
  }
}