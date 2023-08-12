
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fizzDiv = scan.nextInt();
        int buzzDiv = scan.nextInt();
        int range = scan.nextInt();
        boolean doPrintNum = true;

        for (int i = 1; i <= range; i++) {
            if (i % fizzDiv == 0) {
                System.out.print("Fizz");
                doPrintNum = false;
            }
            if (i % buzzDiv == 0) {
                System.out.print("Buzz");
                doPrintNum = false;
            }

            if (doPrintNum)
                System.out.print(i);

            doPrintNum = true;
            System.out.println();
        }

        scan.close();
    }
}