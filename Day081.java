import java.util.Scanner;
public class Dayp81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = sc.nextInt();

        int[] dataArray = new int[jumlah];

        System.out.println("\n--- Input Elemen Array ---");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print("Elemen indeks ke-" + i + ": ");
            dataArray[i] = sc.nextInt();
        }

        System.out.println("\n--- Hasil Isi Array ---");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println("Indeks ke-" + i + " bernilai: " + dataArray[i]);
        }

        sc.close();
    }
}
