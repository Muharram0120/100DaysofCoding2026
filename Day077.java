
import java.util.Scanner;

public class Day077 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama = "Muharram";

        System.out.print("Masukkan nama: ");
        String inputNama = in.nextLine();

        System.out.print("Masukkan kalimat: ");
        String kalimat = in.nextLine();

        System.out.println("\n===== HASIL MANIPULASI STRING =====");

        System.out.println("Jumlah karakter nama: " + inputNama.length());

        System.out.println("Huruf kapital: " + inputNama.toUpperCase());

        System.out.println("Huruf kecil: " + inputNama.toLowerCase());

        System.out.println("Nama sama: " + nama.equals(inputNama));

        System.out.println("Nama sama (abaikan huruf): " +
                nama.equalsIgnoreCase(inputNama));

        System.out.println("Mengandung kata Java: " + kalimat.contains("Java"));

        if (inputNama.length() > 0) {
            System.out.println("Karakter pertama: " + inputNama.charAt(0));
        }

        if (inputNama.length() >= 4) {
            System.out.println("Empat karakter pertama: " + inputNama.substring(0, 4));
        }

        System.out.println("Mengganti huruf a menjadi o: " + inputNama.replace("a", "o"));

        String namaBersih = inputNama.trim();
        System.out.println("Nama setelah trim(): " + namaBersih);

    }
}
