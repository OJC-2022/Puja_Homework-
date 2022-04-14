import java.util.*;

public class MiniCalculator {
    static Scanner sc = new Scanner(System.in);
    static {
        System.out.println("Welcome to Mini Calculator");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Remainder\n0. Exit");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        switchcase(choice);

    }

    public static void switchcase(int choice) {

        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            case 5:
                remainder();
                break;
            case 0:
                System.out.println("exited");
                System.exit(0);
            default:
                System.out.println("Invalid option!!!\nPlease enter correct option.");
        }
    }

    public static void add() {
        System.out.println("Enter two numbers for addition : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }

    public static void subtract() {
        System.out.println("Enter two numbers for subtraction : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }

    public static void multiply() {
        System.out.println("Enter two numbers for multiplication : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }

    public static void divide() {
        System.out.println("Enter two numbers for division : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("enter valid number.. please enter natural number...");
        } else
            System.out.println(a / b);

    }

    public static void remainder() {
        System.out.println("Enter two numbers for remainder : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("enter valid number.. please enter natural number...");
        } else
            System.out.println(a % b);
    }

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("-----------------------------------------");
            System.out.println("Mini Calculator");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Remainder\n0. Exit");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switchcase(choice);
        } while (choice != 0);
    }

}
