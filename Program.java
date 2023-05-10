import java.util.Scanner;

class Program{
    public static void main(String[] args) {
        System.out.println("Enter the choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1: System.out.println("You've choosen 1st opt.");
            break;
            case 2: System.out.println("You've choosen 2nd opt.");
            break;
            case 3: System.out.println("You've choosen 3rd opt.");
            break;
            case 4: System.out.println("You've choosen 4th opt.");
            break;
            default: System.out.println("invalid choice...!");
            break;
        }
    }
}