import java.util.*;

public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acount = 0, dcount = 0, times = Integer.parseInt(sc.nextLine());
        String won = sc.nextLine();

        for (int i = 0; i < times; i++) {
            if (won.charAt(i) == 'A')
                acount++;
            else
                dcount++;
        }
        if (acount == dcount)
            System.out.println("Friendship");
        else if (acount > dcount) {
            System.out.println("Anton");
        } else
            System.out.println("Danik");
        sc.close();
    }
}
