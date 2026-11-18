import java.util.Scanner;
public class Day078 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("==== DAFTARKAN AKUN ====");
        System.out.print("Masukkan Nama pengguna: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan pasword: ");
        String pw = sc.nextLine();
        String username;
        String pasword ;
        do {
            System.out.println("==== LOGIN DISINI ====");
            System.out.print("Masukkan Nama pengguna: ");
            username = sc.nextLine();
            System.out.print("Masukkan pasword: ");
            pasword = sc.nextLine();
        } while (!username.equals(nama) && !pasword.equals(pw));
        System.out.println("Login Berhasil");
        sc.close();
    }
}
