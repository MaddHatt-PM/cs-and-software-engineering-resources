import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = scan.nextInt();
        scan.close();

        if (price < 149) {
            System.out.println(99);
            System.exit(0);
        }

        int head = price / 100 * 100;
        int remainder = price % 100;
        if (remainder >= 49) {
            remainder = 99;
        } else {
            remainder = -1;
        }

        System.out.println(head + remainder);
    }
}