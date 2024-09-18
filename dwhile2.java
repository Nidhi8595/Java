public class dwhile2 {
    public static void main(String[] args) {
        int i = 1, j;
        while (i <= 4) {
            j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println("\n");
            i++;
        }
    }
}
