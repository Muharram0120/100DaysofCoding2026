
import java.util.Scanner;

public class Day055 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<10; i++){
          if(i%2==0){
            continue;
          }
          System.out.println(i);
        }

        int pilihan = 0;

        while (true) {
            System.out.print("masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Halo, Selamat Belajar Java!");
                    break;

                case 2:
                    System.out.println("Nama saya Muharram.");
                    break;

                case 3:
                    System.out.println("Program berhenti.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
