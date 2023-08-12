import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] values = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bridges = values[0] - 1;
        // int knights = values[1] ;
        // int knightsInAGroup = values[2];
        int groups = values[1] / values[2];
        double days = (double) bridges / groups;
        // days += (bridges % groups > 0) ? 0 : 1;
        System.out.println((int) Math.ceil(days));
    }
}
