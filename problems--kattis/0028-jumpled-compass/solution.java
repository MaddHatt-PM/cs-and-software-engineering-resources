import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int valA = Integer.parseInt(reader.readLine());
        int valB = Integer.parseInt(reader.readLine());
        int output = 0;

        boolean passing359 = valA + (valA - valB) > 359;

        output = valB - valA;

        if (valA > valB && passing359) {
            output = valA - (valB + 360);
            output *= -1;
        }

        if (360 - output < output) {
            output = (360 - output) * -1;
        }

        if (output == -180)
            output = 180;

        System.out.println(output);
    }
}