import java.util.Scanner;
class Program{
  public static void main(String[] args) {
    //Search the element in the array:

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of array: ");

    int size = sc.nextInt();

    int array[] = new int[size];

    System.out.println("Enter the elements: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextInt();
    }

    System.out.print("The elements that you've entered: ");

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]+" ");
    }

    System.out.println("\nEnter the element that you want to search: ");
    int search = sc.nextInt();

    int count=0;
    for (int i = 0; i < array.length; i++) {
      if(search==array[i]){
        count++;
      }
    }

    if (count>0) {
      System.out.print("The "+search+ " element is found!");
    }
    else{
      System.out.print("The "+search+ " element is NOT-found!");
    }
  }
}