import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();

        char curr = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != curr) {
                System.out.print(input.charAt(i));
            }
        }

        System.out.println(curr);
    }
}
