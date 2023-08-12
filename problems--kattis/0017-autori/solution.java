import java.util.ArrayList;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("-");
        ArrayList<String> words = new ArrayList<String>();
        while (scan.hasNext()) {
            words.add(scan.next());
        }

        for (String word : words) {
            System.out.print(word.charAt(0));
        }
        System.out.print('\n');
        scan.close();
    }
}
