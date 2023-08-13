import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] vals = s.nextLine().split(" ");
        s.close();

        String result = "";

        if (vals[0] == "E") {
            char curr = vals[1].charAt(0);
            int count = 0;
            for (int i = 0; i < vals[1].length(); i++) {
                if (curr == vals[1].charAt(i)) {
                    count++;
                } else {
                    result += curr;
                    result += Integer.toString(count);

                    curr = vals[1].charAt(i);
                    count = 1;
                }
            }

            result += curr;
            result += Integer.toString(count);

        } else {
            for (int i = 0; i < vals[1].length(); i += 2) {
                char c = vals[1].charAt(i);
                int occ = vals[1].charAt(i + 1) - '0';
                for (int j = 0; j < occ; j++) {
                    result += c;
                }
            }
            System.out.println(result);
        }

        System.out.println(result);
    }
}
