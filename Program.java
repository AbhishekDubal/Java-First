//factorial of number

import java.util.Scanner;
class Program{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int res = 1;

        for(int i = number ; i>= 1; i--){
            res = res * i;
        }

        System.out.println(res+" is factorial of "+number);

    }
}