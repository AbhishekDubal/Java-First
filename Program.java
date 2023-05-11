//greatest number among 3 numbers.

import java.util.Scanner;
class Program{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the 3 numbes: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b) ? (a > c ? a : c) :(b>c ? b: c);

        System.out.println(" "+a+" "+b+" "+c+" Among these 3 numbers:"+max+" is maximum number");
    }
}