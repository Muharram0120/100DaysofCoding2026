import java.util.Scanner;

public class Day068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                continue;
            }
            if (i % M == 0) {
                System.out.println("Target kelipatan ditemukan!");
                break;
            }
            System.out.println(i);
        }
    }
}
