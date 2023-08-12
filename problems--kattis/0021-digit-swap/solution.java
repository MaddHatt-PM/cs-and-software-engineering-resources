import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String output = scan.nextLine();
        for (int i = output.length() - 1; i >= 0; i--) {
            System.out.print(output.charAt(i));
        }
        System.out.print('\n');
        scan.close();
    }
}