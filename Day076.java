public class Day076 {
    public static void main(String[] args) {

        String nama = "   Muharram   ";

        String a = nama.trim();

        String b = a.substring(0, 4);

        String c = a.replace("a", "o");

        System.out.println("Nama asli: " + nama);
        System.out.println("Trim: " + a);
        System.out.println("Substring: " + b);
        System.out.println("Replace: " + c);
    }
}
