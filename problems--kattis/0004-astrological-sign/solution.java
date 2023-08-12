import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution {
    public static class Range {
        private int low;
        private int high;
        private String astroSign;

        public Range(int low, int high, String astroSign) {
            this.low = low;
            this.high = high;
            this.astroSign = astroSign;
        }

        public boolean contains(int value) {
            return low <= value && value <= high;
        }
    }

    public static void main(String[] args) {
        Range[] astroSignRanges = new Range[] {
                new Range(1, 20, "Capricorn"),
                new Range(21, 50, "Aquarius"),
                new Range(51, 79, "Pisces"),
                new Range(80, 110, "Aries"),
                new Range(111, 140, "Taurus"),
                new Range(141, 172, "Gemini"),
                new Range(173, 203, "Cancer"),
                new Range(204, 234, "Leo"),
                new Range(235, 264, "Virgo"),
                new Range(265, 295, "Libra"),
                new Range(296, 326, "Scorpio"),
                new Range(327, 355, "Sagittarius"),
                new Range(356, 365, "Capricorn"),
        };

        Map<String, Integer> monthOffsetMap = new HashMap<String, Integer>();
        monthOffsetMap.put("Jan", 0);
        monthOffsetMap.put("Feb", 31);
        monthOffsetMap.put("Mar", 59);
        monthOffsetMap.put("Apr", 90);
        monthOffsetMap.put("May", 120);
        monthOffsetMap.put("Jun", 151);
        monthOffsetMap.put("Jul", 181);
        monthOffsetMap.put("Aug", 212);
        monthOffsetMap.put("Sep", 243);
        monthOffsetMap.put("Oct", 273);
        monthOffsetMap.put("Nov", 304);
        monthOffsetMap.put("Dec", 334);

        Scanner scan = new Scanner(System.in);
        int counter = scan.nextInt();
        String output = "";

        for (int i = 0; i < counter; i++) {
            int day = scan.nextInt();
            String month = scan.next();

            // Handle leap years
            if (day == 29 && month == "February") {
                output += "Pisces" + '\n';
                continue;
            }

            day += monthOffsetMap.get(month);
            for (Range range : astroSignRanges) {
                if (range.contains(day)) {
                    output += range.astroSign + '\n';
                    continue;
                }
            }
        }

        scan.close();
        System.out.println(output.substring(0, output.length() - 1));
    }
}