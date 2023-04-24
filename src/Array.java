public class Array {
    public static void main(String[] args) {
//        oneDemensionArray();

//        multiDeimensionalArray();


        int[] sourceArray = {1,2,3,4,5};
        int[] destinationArray = new int[3];
        System.arraycopy(sourceArray,1, destinationArray,1,2);
       for(int a : destinationArray){
           System.out.println(a);
       }

    }

    private static void multiDeimensionalArray() {
        float[][] matrix = new float[5][3];
        String[][] sampleData = {
                {"a", "b", "c", "d"},
                {"e", "f", "g", "h"},
                {"i", "j", "k", "l"},
                {"m", "n", "o", "p"},
        };
        System.out.println(sampleData[0][1] + sampleData[0][0] + sampleData[3][2]);

        String[] firstRow = sampleData[0];
        System.out.println(firstRow[0]);

        System.out.println("============");
        sampleData[0][1] = "BAO";
        for (int i = 0; i < sampleData[0].length; i++) {
            System.out.println(sampleData[0][i]);
        }
        System.out.println("============");
        for (String character: sampleData[1]){
            System.out.println(character);
        }

    }

    private static void oneDemensionArray() {
        int[] numbers = new int[10];

        numbers[0] = 10;
        numbers[1] = 500;
        numbers[2] = 1000;
        System.out.println(numbers[2]);


        String names[] = new String[5];
        System.out.println(names[2]);

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(numbers1[2]);
        String[] columnNames = {"No", "name", "Email"};
        System.out.println(columnNames[1]);

        String firstName = columnNames[0];
        System.out.println(firstName);

        columnNames[2] = "Phone";
        columnNames[1] = new String("firstName");

        System.out.println(columnNames[1]);
        System.out.println(columnNames[2]);
        System.out.println("==============");
        for(int number :numbers1){
            System.out.println(number);
        }
    }
}