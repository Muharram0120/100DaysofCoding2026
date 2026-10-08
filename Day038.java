import java.util.Scanner;

public class Day038{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu : \n1.Nasgor Goreng\n2.Mie Ayam nyam\n3.Bakso So");
        System.out.print("Pilih Menu: ");
        int a = in.nextInt();
          if(a==1){
            System.out.println("Ok anda memesan Nasgor Goreng!!!");
          }else if(a==2){
            System.out.println("Selamat menikmati Mie Ayam nyam anda!!!");
          }else if(a==3){
            System.out.println("Bakso So enak siap disantap!!!");
          }else{
            System.out.println("Masukkan pilihan dengan benar!!!");
          }
    }
}
