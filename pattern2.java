public class pattern2 {
    public static void main(String[] args) {
        int i, j;
        for (i = 4; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print("*"); // "print" so that it dosen't automatically give the line gap
            }
            System.out.println("\n");// to jump to next line after each inner loop/round
        }
    }
}
