public class Day087{
  public static void main(String[] args){
    int a[] ={1, 2, 3, 4, 5};
    for(int b : a){
      System.out.print(b+" ");
    }
    System.out.println();
    a[0] = 6;
    for(int b : a){
      System.out.print(b+" ");
    }
  }
}
