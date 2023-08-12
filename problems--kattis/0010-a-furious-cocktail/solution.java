import java.util.Arrays;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int potionCount = scan.nextInt();
        int drinkTime = scan.nextInt();
        int[] consumedPotions = new int[potionCount];
        int[] potionDurations = new int[potionCount];

        for (int i = 0; i < potionDurations.length; i++) {
            potionDurations[i] = scan.nextInt();
            consumedPotions[i] = Integer.MAX_VALUE;
        }
        scan.close();

        Arrays.sort(potionDurations);
        for (int i = potionDurations.length - 1; i >= 0; i--) {
            for (int j = consumedPotions.length - 1; j >= 0; j--) {
                consumedPotions[j] -= drinkTime;
                if (consumedPotions[j] <= 0) {
                    System.out.println("NO");
                    return;
                }
            }
            consumedPotions[i] = potionDurations[i];
        }

        System.out.println("YES");
    }
}