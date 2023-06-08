import java.util.Scanner;
class Program {
  public static void main(String[] args) {
    //Arrays:- Array is a object that can store similar kind of elements in contagious memory(sequential manner).

    //static array: lenth of array elemnts fixed.
    int a[] = new int[4];
    a[0]=10;
    a[1]=108;
    a[2]=105;
    a[3]=170;
    
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }

    //dynamic array: Length will not be fixed.
    int x[] = {2,3,45,5,35};
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i]+"   ");
    }

    //user input dynamic array at output:
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the length of the Array: ");
    int length =sc.nextInt();

    int array []= new int[length];

    System.out.print("Enter the elements: ");
    for (int i = 0; i < array.length; i++) {
       array[i]=sc.nextInt();
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]+" ");
    }
  }
}