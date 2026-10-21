import java.util.Scanner;

public class Day050{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    System.out.println(a%2==0 ? "genap":"ganjil");
  }
}
