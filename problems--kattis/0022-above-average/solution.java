import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupCount = scan.nextInt();
        int studentCount;

        double percentage;
        List<Double> grades = new ArrayList<Double>();
        while (groupCount-- > 0) {
            grades.clear();
            studentCount = scan.nextInt();
            while (studentCount-- > 0) {
                grades.add(scan.nextDouble());
            }

            final double average = grades.stream().mapToDouble(x -> x).average().orElse(0.0);
            percentage = grades.stream().filter(x -> x > average).count() / (double) grades.size();
            System.out.printf("%.3f%%\n", percentage * 100);
        }

        scan.close();
    }
}