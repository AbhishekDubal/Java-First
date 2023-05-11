//calculate power of number

import java.util.Scanner;

class Program{
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.print("Enter the number: ");
        int power = scanner.nextInt();

        int res = 1;
        for (int i = 1; i <= power ; i++) {
               res = res * number;
        }

        System.out.println("The power of "+number+" is: "+res);
    }
}