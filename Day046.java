import java.util.Scanner;


public class Day046{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih Menu:\n1.Nasi goreng\n2.Bakso\n3.Mie Ayam\n4.Es Teh\n");
        System.out.print("Masukkan Pilihan: ");
        int a = in.nextInt();
        switch(a){
            case 1:
                System.out.print("Nasi goreng Anda akan disiapkan ");
                break;
            case 2:
                System.out.print("Bakso Anda akan disiapkan ");
                break;
            case 3:
                System.out.print("Mie Ayam Anda akan disiapkan ");
                break;
            case 4:
                System.out.print("Esteh Anda akan disiapkan ");
                break;
            default:
                System.out.print("Masukkan pilihan dengan benar");
                break;
        }
        
    }
}
