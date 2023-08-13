import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long c = s.nextLong();
        s.close();
        System.out.println(a + b == c ? "correct!" : "wrong!");
    }
}
