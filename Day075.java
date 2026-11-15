import java.util.Scanner;

public class Day075 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String username = "Muharram";

        System.out.print("Masukkan username: ");
        String a = in.nextLine();

        
        System.out.println("Username sama: "+ username.equals(a));

        System.out.println("Username sama (abaikan huruf besar/kecil): "+ username.equalsIgnoreCase(a));

        System.out.println("Mengandung kata 'ram': "+ a.contains("ram"));
      
        System.out.println("Input kosong: "+ a.isEmpty());
    }
}
