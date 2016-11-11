public class MultiDimensionalArray {
    public static void main(String args[]) {
        int values[][][];
        values = new int[5][2][3];
        int value = 11;
        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j < values[i].length; j++) {
                for(int k = 0; k < values[i][j].length; k++) {
                    values[i][j][k] = value++;
                }
            }
        }
        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j < values[i].length; j++) {
                for(int k = 0; k < values[i][j].length; k++) {
                    System.out.println(values[i][j][k]);
                }
            }
        }
    }
}
