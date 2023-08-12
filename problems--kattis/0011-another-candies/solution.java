import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int groups = Integer.parseInt(reader.readLine());

        while (groups-- > 0) {

            reader.readLine();
            long students = Long.parseLong(reader.readLine());
            long total = 0;
            for (int i = 0; i < students; i++) {
                total += Long.parseLong(reader.readLine()) % students;
            }

            System.out.println((total % students == 0) ? "YES" : "NO");

        }
    }
}