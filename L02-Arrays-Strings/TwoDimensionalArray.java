public class TwoDimensionalArray {
    public static void main(String args[]) {
        int values[][] = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}};
        /* Alternative Ways to declare an array
        int values[][];
        values = new int[3][5];
              (or)
        values = new int[3][];
        values[0] = new int[3];
        values[1] = new int[4];
        values[2] = new int[5];
        */
        System.out.println("Row Size "+values.length);
        System.out.println("Column 0 Size "+values[0].length);
        System.out.println("Column 1 Size "+values[1].length);
        /* Alternative way to accessing array
        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j < values[i].length; j++) {
                System.out.println(values[i][j]);
            }
        }
        */
        int rIterator = 0;
        while(rIterator < values.length) {
            int cIterator = 0;
            while(cIterator < values[rIterator].length) {
                System.out.println("\t"+values[rIterator][cIterator]);
                cIterator++;
            }
            rIterator++;
        }
    }
}
