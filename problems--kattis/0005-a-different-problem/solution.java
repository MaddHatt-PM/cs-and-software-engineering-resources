import java.math.BigInteger;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        BigInteger valA = new BigInteger("0");
        BigInteger valB = new BigInteger("0");
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            valA = scan.nextBigInteger();
            valB = scan.nextBigInteger();

            System.out.println(valA.subtract(valB).abs().toString());
        }

        scan.close();
    }
}