import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt() - 5550000;
        s.close();

        System.out.println((0 <= num && num < 10000) ? 1 : 0);
    }
}
