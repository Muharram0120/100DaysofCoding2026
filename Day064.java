import java.util.Scanner;

public class Day064{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
      
        long a =1;
        
        for (int i = 1; i <= m; i++) {
          a*=i;
        }System.out.println(a);
       
    }
}
