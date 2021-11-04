package nio;

import java.io.IOException;
import java.io.InputStreamReader;

public class TestNIO {

    public static void main(String[] args) {
        try (var is = TestNIO.class.getResourceAsStream("/nio/users.txt");
             var reader = new InputStreamReader(is);) {
            int b;
            while ((b = reader.read()) != -1) {
                char ch = (char) b;
                System.out.print(ch);
            }
        } catch (IOException e) {

        }
    }

}
