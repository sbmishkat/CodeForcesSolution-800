import java.util.*;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n != 1) {
            for (int i = 1; i <= n; i++) {

                if (i == n) {
                    if (n % 2 == 1) {
                        System.out.print("I hate it");
                        break;
                    } else {
                        System.out.print("I love it");
                        break;
                    }
                }
                if (i % 2 == 1)
                    System.out.print("I hate that ");
                else
                    System.out.print("I love that ");
            }

        } else
            System.out.print("I hate it");
            sc.close();
    }
}
