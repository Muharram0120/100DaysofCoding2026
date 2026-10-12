import java.util.Scanner;

public class day041{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan suhu(⁰C): ");
        int a = in.nextInt();
        
          if(a>25){
            System.out.println("Cuaca Panas");
          }else if(a>=15){
            System.out.println("Cuaca Sejuk");
          }else{
            System.out.println("Cuaca Dingin");
          }
        
    }
}
