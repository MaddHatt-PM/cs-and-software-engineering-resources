import java.util.Scanner;

public class twostones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(s.nextInt() % 2 == 0 ? "Bob" : "Alice");
        s.close();
    }
}
