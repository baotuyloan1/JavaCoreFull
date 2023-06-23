package Chapter1;

public class NumericIiterals {
    public static void main(String[] args) {
        long a = 9_223_372_036_854_775_807l;
        System.out.println(a);

//        long a1 = 9_223_372_036_854_775_807;
//        System.out.println(a1);
//        => java: integer number too large

        float b = 36.5f;
        System.out.println(b / 35);
        System.out.println(36.5 / 35);

        int x = 1000;
        long y = x;

        long m = 9_223_372_036_854_775_801l;
        int z = (int)m;
        System.out.println(z);


        int o = 12__32;
        System.out.println(o);

        int h = 01231;
        System.out.println(h);


    }


}
