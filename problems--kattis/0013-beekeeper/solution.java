import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        List<Character> vowels = Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u', 'y' });
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> output = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int wordCount = 0;
        while (true) {
            words.clear();
            wordCount = Integer.parseInt(scan.nextLine());
            if (wordCount == 0) {
                break;
            }

            for (int index = 0; index < wordCount; index++) {
                words.add(scan.nextLine());
            }
            String bestWord = words.get(0);
            int bestPairCount = 0;
            for (String word : words) {
                int currPairCount = 0;

                for (int i = 0; i < word.length() - 1; i++) {
                    if (vowels.contains(word.charAt(i))) {
                        char sel = word.charAt(i);

                        if (sel == word.charAt(i + 1) && i + 2 < word.length() && sel == word.charAt(i + 2)) {
                            currPairCount = 0;
                            break;
                        }

                        if (sel == word.charAt(i + 1)) {
                            currPairCount++;
                        }
                    }
                }

                if (currPairCount > bestPairCount) {
                    bestPairCount = currPairCount;
                    bestWord = word;
                }
            }
            output.add(bestWord);
        }

        System.out.println();
        scan.close();
        for (String word : output) {
            System.out.println(word);
        }
    }
}