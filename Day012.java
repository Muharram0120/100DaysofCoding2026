import java.util.Scanner;

public class Day011{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan nama: ");
    String a = in.nextLine();

    System.out.print("Masukkan umur: ");
    int b = in.nextInt();
    in.nextLine();
    System.out.print("Masukkan jenis kelamin: ");
    String c = in.nextLine();
    
    System.out.print("Masukkan alamat: ");
    String d = in.nextLine();
    
    System.out.print("Masukkan jurusan: ");
    String e = in.nextLine();
    
    System.out.print("Masukkan hobi: ");
    String f = in.nextLine();
    System.out.println();
    System.out.println("===== BIODATA DIRI =====");
    System.out.println("Nama\t\t:"+a);
    System.out.println("Umur\t\t:"+b+" tahun");
    System.out.println("Jenis Kelamin \t:"+c);
    System.out.println("Alamat\t\t:"+d);
    System.out.println("Jurusan\t\t:"+e);
    System.out.println("Hobi\t\t:"+f);
    System.out.println("========================");
  }
}
    
