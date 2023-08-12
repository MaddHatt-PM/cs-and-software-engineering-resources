import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int goal = Integer.parseInt(reader.readLine());
        int printers = 1;
        int statues = 0;
        int days = 0;
        while (statues < goal) {
            days++;
            if (goal - statues > printers) {
                printers += printers;
            } else {
                statues += printers;
            }
        }

        System.out.println(days);
    }
}
