
import java.util.Scanner;

public class Day056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
