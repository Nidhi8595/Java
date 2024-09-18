public class pattern1 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*"); // "print" so that it dosen't automatically give the line gap
            }
            System.out.println("\n");// to jump to next line after each inner loop/round
        }
    }
}
