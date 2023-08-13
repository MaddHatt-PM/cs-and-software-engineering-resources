import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String output = "";
        char curr = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != curr) {
                curr = s.charAt(i);
                output += curr;
            }
        }

        System.out.println(output);
    }
}
