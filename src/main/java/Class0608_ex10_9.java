import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Class0608_ex10_9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("c:/JAVA/test/Java05.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        int ch;

        while ( (ch = isr.read()) != -1)
            System.out.print((char) ch);

        fis.close();
    }
}
