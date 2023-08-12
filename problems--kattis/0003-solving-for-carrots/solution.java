import java.util.Scanner;

// Inputs:
// -> Two integers: contestantCount, solutionCount
// -> Descriptors seperated by \n (Possibly meaningless)

// Outputs:
// carrotCount ->

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.nextInt();
        int solutionCount = scan.nextInt();
        scan.close();

        System.out.println(solutionCount);
    }
}
