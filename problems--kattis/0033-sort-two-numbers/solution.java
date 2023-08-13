import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        System.out.print(a < b ? a : b);
        System.out.print(" ");
        System.out.print(a < b ? b : a);
        System.out.println();
    }
}