import java.util.Scanner;
class Program{
  public static void main(String[] args) {
    //Inserting another element in the array:

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array: ");
    int size = sc.nextInt();

    int array[] = new int [size+1];

    System.out.print("Enter the array elements in array: ");
    for (int i = 0; i < size; i++) {
      array[i]  = sc.nextInt();
    }

    System.out.println("The elements that you've eneterd now: ");
    for (int i = 0; i < size; i++) {
      System.out.print(" "+array[i]);
    }

    System.out.println("\nNow... Where do you want to insert your value: ");
    int location = sc.nextInt();
    
    System.out.println("What value you want to enter there!");
    int value = sc.nextInt();
/**
 * //here it'll not give the last value. Because, suppose 4+1 =4, here if the 5th value is none in a sense the value would considered as 0(defalut integer value).
    for (int i = 0; i < array.length; i++) {
      if(location == i){
        array[i+1] = array[i];
      }
    }

    array[location] = value;
    for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
    }
   */
  //So, to vaid this problem we should start with array's length

  for(int i = array.length-1; i > location; i--){
    array[i] = array[i-1];
  }
  array[location] = value;

  for (int i = 0; i < array.length; i++) {
    System.out.print(array[i]+" ");
  }
  }
}