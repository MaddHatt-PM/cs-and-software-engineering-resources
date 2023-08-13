import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[s.nextInt()];
        for (int i = 0; i < nums.length; i++)
            nums[i] = s.nextInt();

        for (int i = nums.length - 1; 0 <= i; i--)
            System.out.println(nums[i]);

        s.close();
    }
}
