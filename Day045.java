import java.util.Scanner;


public class Day044{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        double a = in.nextDouble();
        if (a<=100 && a>=0) {
        System.out.print("\nGrade: ");
            if (a>85) {
            System.out.println("A");
            }else if (a>80) {
                System.out.println("A-");
            }else if (a>75) {
                System.out.println("B+");
            }else if (a>70) {
                System.out.println("B");
            }else if (a>65) {
                System.out.println("B-");
            }else if (a>50) {
                System.out.println("C");
            }else if (a>40) {
                System.out.println("D");
            }else{
                System.out.println("E");
            }
        }else{
            System.out.println("Masukkan Angka dengan benar");
        }
        
    }
}
