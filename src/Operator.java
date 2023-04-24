public class Operator {
    public static void main(String[] args) {
//        number();

//        stringConcatenation();

        integer();

    }

    private static void integer() {
        int x = 51234;
        System.out.println(x * 16);
        System.out.println(x << 4);

        System.out.println(x / 16);
        System.out.println(x >> 4);

        byte a = 41;
        System.out.println(a);
    }

    private static void stringConcatenation() {
        String message = "Hello";
        int a = 5;
        int b = 8;
        System.out.println(a + b + message);


        float x = 0.75f;
        float y = x++;
        System.out.println(x);
        System.out.println(y);
    }

    private static void number() {
        float a = -5 / 4;
        System.out.println(a);

        float b = 3f / 4F;
        System.out.println(b);

        float c = 3f / 4;
        System.out.println(c);

        float d = 3 / 4f;
        System.out.println(d);

        float e = 3 / ((float) 4);
        System.out.println(e);

        long x = -3;
        int y = 4;
        float z = (float) (x / y);
        System.out.println(z);

        int integer = 100;
        float result = integer / 0;
        System.out.println(result);

        double pi = 3.14f;
        double resultPi = pi / 0;
        System.out.println(resultPi);

        double resultRe = pi % 0;
        System.out.println(resultRe);
    }
}
