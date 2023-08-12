import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        // Order: kings, queens, rooks, bishops, knights, pawns
        int[] pieces = { 1, 1, 2, 2, 2, 8 };
        int[] output = new int[6];
        Scanner scan = new Scanner(System.in);

        int index = 0;

        while (index < pieces.length) {
            output[index] = pieces[index] - scan.nextInt();
            index++;
        }

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if (i + 1 != output.length) {
                System.out.print(' ');
            } else {
                System.out.print('\n');
            }
        }
        scan.close();
    }
}