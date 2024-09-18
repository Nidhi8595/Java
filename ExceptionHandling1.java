import java.io.FileInputStream;

public class ExceptionHandling1 {
    public static void main(String[] args) {

        // System.out.println("1");
        // System.out.println("2");
        // System.out.println("3"); // program will execute normally upto this only
        // System.out.println(100 / 0); // this will throw ArithmeticException due to
        // division by 0
        // System.out.println("4");
        // System.out.println("5");
        // System.out.println("6");
        // System.out.println("7");
        // System.out.println("8");
        // System.out.println("9");

        // FileInputStream fis = new FileInputStream("D:/abc.txt"); //
        // FileNotFoundException may arise
        // (Compile-time Exception)

        // Syntax:-
        /*
         * try{
         * Risky code
         * }
         * catch(Exception e){
         * Handling code
         * }
         */

        // Example -> 1
        try {
            FileInputStream fis = new FileInputStream("D:/abc.txt");
        } catch (Exception e) {
            System.out.println("Exception -> " + e);
        }
        // now compilation will take place normally

        // Example -> 2
        int a = 100, b = 0, c;
        // c = a / b; // division by 0 :- (RuntimeException)
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception -> Division by zero");
        }

        // Example -> 3
        String s = null;
        // System.out.println(name.length()); // NullPointerException (Runtime)
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace(); // effective bcuz it prints whole exceptional object
        }

    }
}
