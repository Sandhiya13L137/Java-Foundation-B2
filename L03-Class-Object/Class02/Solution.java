import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.CIRCLE\t2.TRIANGLE\t3.RECTANGLE");
        System.out.print("Choice : ");
        int choice = Integer.parseInt(bf.readLine());
        switch(choice) {
            case 1:
                System.out.println("\n\tCIRCLE");
                System.out.println("\t-------");
                System.out.print("Radius : ");
                Circle circle = new Circle();
                circle.radius = Double.parseDouble(bf.readLine());
                circle.area();
                break;
            case 2:
                System.out.println("\n\tTRIANGLE");
                System.out.println("\t---------");
                System.out.print("Base : ");
                Triangle triangle = new Triangle();
                triangle.base = Double.parseDouble(bf.readLine());
                System.out.print("Height : ");
                triangle.height = Double.parseDouble(bf.readLine());
                triangle.area();
                break;
            case 3:
                System.out.println("\n\tRECTANGLE");
                System.out.println("\t----------");
                System.out.print("Length : ");
                Rectangle rectangle = new Rectangle();
                rectangle.length = Double.parseDouble(bf.readLine());
                System.out.print("Breadth : ");
                rectangle.breadth = Double.parseDouble(bf.readLine());
                rectangle.area();
                break;
        }
    }
}
