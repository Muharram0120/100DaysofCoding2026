public class Day074{

    public static void main(String[] args) {
        String nama = "Muharram";
        int panjang = nama.length();

        String hasil1 = nama.toUpperCase();
        String hasil2 = nama.toLowerCase();

        System.out.println("Nama asli: " + nama);
        System.out.println("Panjang nama: "+ panjang);
        System.out.println("Nama kapitil: " + hasil2);
        System.out.println("Nama kapital: " + hasil1);
    }
}
