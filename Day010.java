public class day010{
    public static void main(String[] args) {
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;

        System.out.println("Byte   : " + minByte + " s/d " + maxByte);
        System.out.println("Short  : " + minShort + " s/d " + maxShort);
        System.out.println("Int    : " + minInt + " s/d " + maxInt);
        System.out.println("Long   : " + minLong + " s/d " + maxLong);
        System.out.println("Float  : " + minFloat + " s/d " + maxFloat);
        System.out.println("Double : " + minDouble + " s/d " + maxDouble);
        System.out.println("Char   : " + (int) minChar + " s/d " + (int) maxChar);
    }
}
