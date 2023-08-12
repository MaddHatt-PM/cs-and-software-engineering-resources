import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        Stack<Character> processor = new Stack<Character>();
        Map<Character, Character> inputs = new HashMap<Character, Character>();
        inputs.put(')', '(');
        inputs.put(']', '[');
        inputs.put('}', '{');

        int counter = -1;
        for (Character character : line.toCharArray()) {
            counter++;
            if (character.equals(' '))
                continue;

            if (inputs.containsValue(character)) {
                processor.push(character);
                continue;
            }

            if (inputs.containsKey(character)) {
                if (processor.size() == 0 || inputs.get(character).equals(processor.pop()) == false) {
                    System.out.println(character + " " + counter);
                    return;
                }
            }
        }

        System.out.println("ok so far");
    }
}