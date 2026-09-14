import java.util.Scanner;

pubic class day013{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();
        System.out.print("Masukkan tahun lahir: ");
        int tl = in.nextInt();
        System.out.print("Masukkan tahun sekarang: ");
        int ts = in.nextInt();
        System.out.println();
        System.out.println("Nama: "+nama);
        System.out.println("Umur :"+(ts-tl)+" tahun");
        System.out.println();
        in.nextLine();

        // soal 2 //
        System.out.print("Nama barang: ");
        String a = in.nextLine();
        System.out.print("Harga: ");
        int b = in.nextInt();
        System.out.print("Jumlah: ");
        int c = in.nextInt();
        System.out.println();
        System.out.println("Barang: "+a);
        System.out.println("Harga: Rp."+b);
        System.out.println("Jumlah: "+c);
        System.out.println("Total Rp.:"+b*c);
        System.out.println();

        // soal 3 //
        System.out.print("Panjang: ");
        int panjang = in.nextInt();
        System.out.print("Lebar: ");
        int lebar = in.nextInt();
        int luas = panjang * lebar;
        System.out.println("Luas : "+ luas );
    

    }
}
