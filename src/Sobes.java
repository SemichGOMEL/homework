
import java.util.Scanner;

public class Sobes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String simple[] = new String[9];
        for (int i = 0; i < 9; i++) {
            simple[i] = sc.nextLine();
        }
        boolean z = Exsich(simple);
        System.out.println(z);
    }

    private static boolean Exsich(String[] simple) {
        int k = 0;
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        for (int i = 0; i < 9; i++) {
            if (one.equals(simple[i])) {
                k++;
            }
        }
        if (k == 0) {
            return false;
        } else {
            return true;
        }
    }
}
