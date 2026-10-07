import java.util.Scanner;

public class day036{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
          if(a==0){
            System.out.println("Bilangan Nol");
          }else if(a%2==0){
            System.out.println("Bilangan Genap");
          }else{
            System.out.println("Bilangan Ganjil");
          } 
    }
}
