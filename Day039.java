import java.util.Scanner;

public class Day039{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===Kalkulator sederhana===");
        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();
        System.out.print("Masukkan operator aritmatika: ");
        char c = in.next().charAt (0);
        
          if(c=='+'){
            System.out.println(a+" + "+b+" = "+(a+b));
          }else if(c=='-'){
            System.out.println(a+" - "+b+" = "+(a-b));
          }else if(c=='*'){
            System.out.println(a+" * "+b+" = "+(a*b));
          }else if(c=='/'){
            if(b==0){
              System.out.println("Error");
            }else{
              System.out.println(a+" / "+b+" = "+(double)a/b);
            }
          }else if(c=='%'){
            if(b==0){
              System.out.println("Error");
            }else{
              System.out.println(a+" % "+b+" = "+(a%b));
            }
          }else{
            System.out.println("Masukkan pilihan dengan benar!!!");
          }
    }
}
