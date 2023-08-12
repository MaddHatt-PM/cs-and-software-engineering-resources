import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a') {
                System.out.println(line.substring(i));
                return;
            }
        }
    }
}