import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int res = 0;
        int count = s.nextInt();

        for (int i = 0; i < count; i++) {
            res += s.nextInt();
        }

        s.close();
        System.out.println(res);
    }
}
