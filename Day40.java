import java.util.Scanner;

public class DiskonBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca masukan (3 baris)
        String jenisPelanggan = scanner.nextLine().trim();
        int urutan = scanner.nextInt();
        double hargaBarang = scanner.nextDouble();
        
        double persentaseDiskon = 0;
        String namaPelanggan = "";
        
      
        if (jenisPelanggan.equals("R")) {
            namaPelanggan = "Reguler";
            if (urutan % 2 != 0) {
                persentaseDiskon = 0.05; 
            } else {
                persentaseDiskon = 0.10; 
            }
        } else if (jenisPelanggan.equals("M")) {
            namaPelanggan = "Member";
            if (urutan % 2 != 0) {
                persentaseDiskon = 0.15; 
            } else {
                persentaseDiskon = 0.20; 
            }
        } else {
      
            System.out.println("Jenis pelanggan tidak valid");
            return;
        }
        
        
        double potonganHarga = hargaBarang * persentaseDiskon;
        double hargaAkhir = hargaBarang - potonganHarga;
        
        
        System.out.println("Pelanggan\t: " + namaPelanggan);
        System.out.println("Urutan\t\t: " + urutan);
        System.out.println("Diskon\t\t: " + (int)(persentaseDiskon * 100) + "%");
        System.out.println("Potongan\t: Rp" + (int)potonganHarga);
        System.out.println("Harga Akhir\t: Rp" + (int)hargaAkhir);
        
        scanner.close();
    }
}
