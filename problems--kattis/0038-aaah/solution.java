import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String actual = s.nextLine();
        String target = s.nextLine();
        System.out.println(actual.length() < target.length() ? "no" : "go");
        s.close();
    }
}
