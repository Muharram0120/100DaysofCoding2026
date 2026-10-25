public class Day054 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i = 0;
    int n = in.nextInt();

        while (n>1){
          if(n%2==0){
             n=n/2;
          }else{
            n=n*3+1;
          }
          i++;
        }
      System.out.println(n);
      System.out.println(i);
    }
}
