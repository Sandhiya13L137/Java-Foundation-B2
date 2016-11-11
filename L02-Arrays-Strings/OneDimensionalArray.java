public class OneDimensionalArray {
    public static void main(String args[]) {
        String names[] = {"Steve", "James", "Frank", "Chrish", "Rossum",};
        int iterator = 0;
        System.out.println("Size of names is "+names.length);
        while(iterator < names.length) {
            System.out.println(names[iterator]);
            iterator++;
        }
        names = new String[7];
        iterator = 0;
        System.out.println("After resize.. Size of names is "+names.length);
        while(iterator < names.length) {
            System.out.println(names[iterator]);
            iterator++;
        }
        int values[];           // Declaration
        values = new int[5];    // Instantiation
        values[0] = 11;
        values[1] = 12;
        values[2] = 13;
        values[3] = 14;
        values[4] = 15;
        System.out.println("Size of values is "+values.length);
        iterator = 0;
        while(iterator < values.length) {
            System.out.println(values[iterator]);
            iterator++;
        }
        values = new int[10];
        System.out.println("After Resize... Size of values is "+values.length);
        iterator = 0;
        while(iterator < values.length) {
            System.out.println(values[iterator]);
            iterator++;
        }
    }
}
