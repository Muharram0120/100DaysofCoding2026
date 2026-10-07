import java.util.Scanner;

public class day037{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        
          if(a==0){
            System.out.println("Bilangan Nol");
          }else if(a>0){
            System.out.println("Bilangan Positif");
          }else{
            System.out.println("Bilangan Negatif");
          }
        
    }
}
