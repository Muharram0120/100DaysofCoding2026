import java.util.Scanner;


public class Day072{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=0;
        while(true){
            int a = in.nextInt();
            if (a<0) {
                break;
            }
            t+=a;
        }System.out.println(t);
    }   
}
