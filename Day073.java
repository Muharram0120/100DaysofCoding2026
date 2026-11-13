
package javaapplication45;
import java.util.*;

public class Mangino{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int anu;

        do{
          System.out.println("""
                        1. jefri keren
                        2. Jefri sangat keren
                        3. Mentor yang paling keren adalah jefri brodi""");
          System.out.print("Pilih: ");
          anu = in.nextInt();

          switch(anu){
            case 1 ->{
              System.out.println("Anda mengakui bahwa jefri itu sangat keren");
            }
            case 2 ->{
              System.out.println("Anda sangat sangat sangat mengakui bahwa jefri itu sangat keren");
            }
            case 3 ->{
              System.out.println("Anda mengakui bahwa jefri mentor yang paling dan yang sangat sangat keren sekali sedunia");
            }
              default->{
                System.out.println("STOPPPPP, JEFRI SUDAH PUAS DIPUJIII!!!");
                return;
              }
          }
        }while(true);
    }
}
