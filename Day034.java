import java.util.Scanner;

public class day034{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a>100){
          System.out.println("Bilangan Diatas 100");
        }else if(a==100){
          System.out.println("Bilangan 100");
        }else{
          System.out.println("Bilangan Dibawah 100");
        }
    }
}
