import java.util.*;

public class logical {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("True && True ->" + ( true && true));
        // System.out.println("True && False ->" + ( true && false));
        // System.out.println("True || True ->" + ( true || true));
        // System.out.println("True || False ->" + ( true || false));
        // System.out.println("False || False ->" + ( false || false));
        // System.out.println("! True ->" + ( !true));
        System.out.println("AND logic b/w (2>3) & (3>2) ->" + ((2 > 3) && (3 > 2)));
        System.out.println("AND logic b/w (2<3) & (3<4) ->" + ((2 < 3) && (3 < 4)));
        System.out.println("OR logic b/w (2>3) & (3>2) ->" + ((2 > 3) || (3 > 2)));
        System.out.println("OR logic b/w (2<3) & (3<4) ->" + ((2 < 3) || (3 < 4)));
        System.out.println("NOT logic on (2<3) ->" + (!(2 < 3)));
    }

}
