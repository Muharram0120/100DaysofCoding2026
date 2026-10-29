import java.util.Scanner;

public class Day058 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("genap: ");
        for (int i = n; i >= 1; i--) {
          if(i%2==0){
            System.out.print(i + " ");
          }
        }
        System.out.println();
        System.out.print("ganjil: ");
        for (int i = n; i >= 1; i--) {
          if(i%2==1){
            System.out.print(i + " ");
          }
        }
    }
}
