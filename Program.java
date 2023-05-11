//print a table for given number.

import java.util.Scanner;

class Program {
    public static void main(String[] args) {
     Scanner sc = new  Scanner(System.in);

     System.out.print("Enter the number of WHAT tabel you want to print: ");

     int number  = sc.nextInt();

     for(int i = 1; i <= 10; i++){
        System.out.println(number+" * "+i+" = "+number*i);
     }
        
    }
}