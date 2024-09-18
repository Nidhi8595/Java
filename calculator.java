import java.util.*;// * imports all packages

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// in can be replaced by any object name
        System.out.println("Enter values ");
        int a = in.nextInt();// taking integer as input
        int b = in.nextInt();
        System.out.println("1. Sum");
        System.out.println("2. Multiplication");
        System.out.println("3. Division");
        System.out.println("4. Subtraction");
        System.out.println("Enter the operation you wanna perform->");
        int c = in.nextInt();
        switch (c) {
            case 1: {
                System.out.println("Sum->" + (a + b));
                break;
            }
            case 2: {
                System.out.println("Product->" + (a * b));
                break;
            }
            case 3: {
                System.out.println("Quotient->" + (a / b));
                System.out.println("Remainder->" + (a % b));
                break;
            }
            case 4: {
                System.out.println("Difference->" + (a - b));
                break;
            }
            default: {
                System.out.println("Error");
                break;
            }
        }
    }
}
