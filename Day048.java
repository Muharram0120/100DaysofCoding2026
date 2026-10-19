
import java.util.Scanner;

public class Day048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hasil=0;

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '/':
                if (angka2 != 0) {
                    
                    System.out.println("Hasil: " + (double) angka1/angka2);
                } else {
                    System.out.println("Error: Tidak bisa dibagi dengan nol!");
                }
                break;
            
             case '%':
                if (angka2 != 0) {
                    hasil = angka1 % angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Tidak bisa dibagi dengan nol!");
                }
                break;

            default:
                System.out.println("Operator tidak valid!");
        }

        input.close();
    }
}
