import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadingInput {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(bf.readLine());
        System.out.println(value);
        String str = bf.readLine();
        System.out.println(str);
    }
}
