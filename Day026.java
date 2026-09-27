import java.util.Scanner;

public class day026 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int saldo = in.nextInt();
        int tarik = in.nextInt();

        int lembar = tarik / 100000;
        int sukses = lembar * 100000;
        int gagal = tarik % 100000;

        System.out.println("Berhasil ditarik   : Rp" + sukses);
        System.out.println("Jumlah lembar 100rb: " + lembar + " lembar");
        System.out.println("Gagal ditarik      : Rp" + gagal);
    }
}
