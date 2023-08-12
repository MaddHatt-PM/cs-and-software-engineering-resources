import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        while (count-- > 0) {
            int val = scan.nextInt();
            System.out.print(val + " is ");
            System.out.println(Math.abs(val) % 2 == 0 ? "even" : "odd");
        }

        scan.close();
    }
}