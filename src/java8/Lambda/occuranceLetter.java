package src.java8.Lambda;

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
        System.out.println(count);

    }
}
