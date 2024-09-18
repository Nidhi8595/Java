public class pattern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            for (int l = 3; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
