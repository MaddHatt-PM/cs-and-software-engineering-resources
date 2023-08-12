import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution {
    private static BigInteger factorial(int value) {
        BigInteger output = BigInteger.ONE;
        for (int i = 1; i < value + 1; i++) {
            output = output.multiply(new BigInteger(Integer.toString(i)));
        }

        return output;
    }

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            char[] chars = input.toCharArray();
            BigInteger output = new BigInteger("1");

            for (int i = 1; i < chars.length + 1; i++) {
                output = output.multiply(new BigInteger(Integer.toString(i)));
            }

            Map<Character, Integer> uniqueChars = new HashMap<Character, Integer>();
            for (char item : chars) {
                if (uniqueChars.containsKey(item)) {
                    uniqueChars.put(item, uniqueChars.get(item) + 1);
                } else {
                    uniqueChars.put(item, 1);
                }
            }

            for (Character key : uniqueChars.keySet()) {
                if (uniqueChars.get(key) != 1) {
                    output = output.divide(factorial(uniqueChars.get(key)));
                }
            }

            System.out.println(output.toString());
        }
        scan.close();
    }
}