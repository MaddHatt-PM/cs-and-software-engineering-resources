import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        for (int i = 1; i < count + 1; i++) {
            System.out.println(i + " Abracadabra");
        }

        scan.close();
    }
}
