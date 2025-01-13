package src.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occuranceLetter {

    public static void main(String[] args) {

        String word = "todayTomorrow";

        Map<String, Long> count = Arrays.stream(word.split(""))
                                         .collect(Collectors.groupingBy(Function.identity(),
                                                 Collectors.counting()));
        Map<String, Long> countNewApproach = Arrays.stream(word.split(""))
                                     .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(count);
        System.out.println(countNewApproach);

    }
}
