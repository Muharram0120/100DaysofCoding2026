import java.util.Scanner;

public class day035{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean b = in.nextBoolean();
        if(b==true){
          if(a>100){
            System.out.println("Bilangan Diatas 100");
          }else if(a==100){
            System.out.println("Bilangan 100");
          }else{
            System.out.println("Bilangan Dibawah 100");
        }
        }else{
          System.out.println("Error");
        }
        
    }
}
