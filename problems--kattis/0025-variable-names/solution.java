import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        int count = Integer.parseInt(reader.readLine());
        Set<Integer> variableIDs = new LinkedHashSet<Integer>();

        while (count-- > 0) {
            int choice = Integer.parseInt(reader.readLine());
            int attempt = occurrences.getOrDefault(choice, 1);
            while (true) {
                if (variableIDs.contains(choice * attempt) == false) {
                    // System.out.println("tried");
                    variableIDs.add(choice * attempt);
                    occurrences.put(choice, attempt + 1);
                    break;
                }

                attempt++;
            }
        }

        reader.close();

        String output = variableIDs.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("\n"));
        System.out.println(output);

    }
}