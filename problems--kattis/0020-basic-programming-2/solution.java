import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class solution {

    // Confident
    private static void equalTo7777(List<Long> data) {
        Set<Long> seen = new HashSet<>();
        for (int x = 0; x < data.size(); x++) {
            if (data.get(x) <= 7777) {
                seen.add(data.get(x));
                if (seen.contains(7777 - data.get(x))) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }

    // Confident
    private static void areUnique(List<Long> data) {
        Set<Long> dataSet = new HashSet<Long>(data);
        if (dataSet.size() == data.size()) {
            System.out.println("Unique");
        } else {
            System.out.println("Contains duplicate");
        }
    }

    // Most likely good, if anything it might just be slow
    private static void printMedian(List<Long> data) {
        Collections.sort(data);
        boolean isEven = data.size() % 2 == 0;

        if (isEven) {
            int loID = data.size() / 2 - 1;
            int hiID = data.size() / 2;
            System.out.println(data.get(loID) + " " + data.get(hiID));
        } else {
            System.out.println(data.get(data.size() / 2));
        }
    }

    private static void appearsMoreThanHalf(List<Long> data) {
        Map<Long, Long> appearances = data.stream()
                .collect(groupingBy(x -> x, counting()));
        System.out.println(appearances.entrySet()
                .stream()
                .filter(e -> e.getValue() > data.size() / 2)
                .map(Entry::getKey)
                .findFirst()
                .map(String::valueOf)
                .orElse("-1"));
    }

    private static void sortRestrictBetween100And999(List<Long> data) {
        List<Long> sortedData = new ArrayList<Long>();
        for (Long i : data) {
            if (100 <= i && i <= 999)
                sortedData.add(i);
        }
        System.out.println(
                sortedData.stream()
                        .sorted()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" ")));

        // for (int i = 0; i < sortedData.size(); i++) {
        // System.out.print(sortedData.get(i));
        // if (i + 1 < sortedData.size())
        // System.out.print(" ");
        // }
        // System.out.print("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] params = Arrays.stream(reader.readLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Long> data = Arrays.stream(reader.readLine()
                .split(" "))
                .mapToLong(Long::parseLong)
                .boxed()
                .collect(Collectors.toList());

        reader.close();

        switch (params[1]) {
            case 1:
                equalTo7777(data);
                break;

            case 2:
                areUnique(data);
                break;

            case 3:
                appearsMoreThanHalf(data);
                break;

            case 4:
                printMedian(data);
                break;

            case 5:
                sortRestrictBetween100And999(data);
                break;
        }
    }
}