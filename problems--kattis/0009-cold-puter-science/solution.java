import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int coldCount = 0;
        for (int i = 0; i < total; i++) {
            if (scan.nextInt() < 0) {
                coldCount++;
            }
        }
        scan.close();
        System.out.println(coldCount);
    }
}