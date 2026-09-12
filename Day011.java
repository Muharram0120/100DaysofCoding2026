import java.util.Scanner;

public class Day011{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("String: ");
    String a = in.nextLine();
    System.out.println();
    
    System.out.print("Short: ");
    short b = in.nextShort();
    System.out.println();

    System.out.print("Byte: ");
    byte c = in.nextByte();
    System.out.println();

    System.out.print("Integer: ");
    int d = in.nextInt();
    System.out.println();

    System.out.print("Long: ");
    long e = in.nextLong();
    System.out.println();

    System.out.print("Double: ");
    double f = in.nextDouble();
    System.out.println();

    System.out.print("Float: ");
    float g = in.nextFloat();
    System.out.println();

    System.out.print("Char: ");
    char h = in.next().charAt(0);
    System.out.println();

    System.out.print("Boolean: ");
    boolean i = in.nextBoolean();
    System.out.println();

    System.out.println("String = " + a);
    System.out.println("Short = " + b);
    System.out.println("Byte = " + c);
    System.out.println("Integer = " + d);
    System.out.println("Long = " + e);
    System.out.println("Double = " + f);
    System.out.println("Float = " + g);
    System.out.println("Char = " + h);
    System.out.println("Boolean = " + i);
  }
}
