import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lowBounds = 1;
        int highBounds = 1000;
        int guess = 500;
        System.out.println(guess);

        int attempts = 10;
        String input = "";
        while (attempts > 0) {
            input = scan.nextLine();
            if (input.equals("correct")) {
                scan.close();
                return;
            }

            if (input.equals("lower")) {
                highBounds = guess;
                guess = (highBounds + lowBounds) / 2;
                System.out.println(guess);
            }
            if (input.equals("higher")) {
                lowBounds = guess;
                guess = (highBounds + lowBounds + 1) / 2;
                System.out.println(guess);
            }
            attempts--;
        }

        scan.close();
    }
}