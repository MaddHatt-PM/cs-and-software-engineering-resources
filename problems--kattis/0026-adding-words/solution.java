import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class solution {
    public static final int unknownValue = -10000;
    public static final String unknownStr = "unknown";
    public static Map<String, Integer> wordDict = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rawLine = "";

        while ((rawLine = reader.readLine()) != null) {
            String[] tokens = rawLine.split(" ");
            switch (tokens[0]) {
                case "def": {
                    wordDict.put(tokens[1], Integer.parseInt(tokens[2]));
                    break;
                }
                case "calc": {
                    Integer result = 0;
                    boolean applyAddNext = false;
                    boolean applySubNext = false;
                    for (int i = 1; i < tokens.length; i++) {

                        if (tokens[i].equals("+")) {
                            applyAddNext = true;
                            continue;
                        } else if (tokens[i].equals("-")) {
                            applySubNext = true;
                            continue;
                        } else if (tokens[i].equals("=")) {
                            break;
                        }

                        int value = wordDict.getOrDefault(tokens[i], unknownValue);

                        if (value == unknownValue) {
                            result = unknownValue;
                            break;
                        }

                        if (i == 1) {
                            result = value;
                            continue;

                        }

                        if (applyAddNext) {
                            result += value;
                            applyAddNext = false;
                        }

                        if (applySubNext) {
                            result -= value;
                            applySubNext = false;
                        }

                    }

                    final Integer word = result;
                    // System.out.println(">>>>" + wordDict.toString());
                    System.out.println(
                            String.join(" ", tokens).replace("calc ", "") + " " +
                                    wordDict.entrySet()
                                            .stream()
                                            .filter(entry -> word.equals(entry.getValue()))
                                            .findFirst()
                                            .map(Map.Entry::getKey)
                                            .orElse("unknown"));
                    break;
                }
                case "clear": {
                    wordDict.clear();
                    wordDict.put(unknownStr, unknownValue);
                    break;
                }

            }
        }

        reader.close();
    }
}