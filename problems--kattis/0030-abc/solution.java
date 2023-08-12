import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] values = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        Map<Character, Integer> variables = new HashMap<Character, Integer>();
        variables.put('A', values[0]);
        variables.put('B', values[1]);
        variables.put('C', values[2]);

        char[] order = reader.readLine().toCharArray();
        for (int i = 0; i < order.length; i++) {
            System.out.print(variables.get(order[i]));
            if (i + 1 < order.length) {
                System.out.print(" ");
            }
        }
        System.out.flush();
    }
}