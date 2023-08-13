import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ranges = scanner.nextLine().split(";");
        scanner.close();

        int acc = 0;
        for (String s : ranges) {
            if (s.contains("-")) {
                String[] vals = s.split("-");
                int lo = Integer.parseInt(vals[0]);
                int hi = Integer.parseInt(vals[1]);
                acc += hi - lo + 1;
            } else {
                acc++;
            }
        }

        System.out.println(acc);
    }
}
