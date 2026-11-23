public class Day083{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[]= {1, 2, 3, 4, 5};
        int b =0;
        for (int i = 0; i < a.length; i++) {
            b+=a[i];
        }
        System.out.println(b);
    }
}
