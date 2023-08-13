import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rounds = s.nextInt();
        for (int i = 0; i < rounds; i++) {
            int candidates = s.nextInt();
            int total = 0;
            int maxIndex = 0;
            int maxScore = 0;
            boolean isTied = false;
            for (int j = 0; j < candidates; j++) {
                int curr = s.nextInt();
                total += curr;
                if (maxScore == curr) {
                    isTied = true;
                } else if (maxScore < curr) {
                    maxScore = curr;
                    maxIndex = j;
                    isTied = false;
                }
            }

            if (isTied) {
                System.out.println("no winner");
                continue;
            }

            System.out.print(maxScore > total / 2 ? "majority" : "minority");
            System.out.print(" winner ");
            System.out.println(maxIndex + 1);
        }
        s.close();
    }
}
