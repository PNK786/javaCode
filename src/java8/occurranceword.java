package src.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occurranceword
{
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Good", "Evening", "Friday","Apple", "Good");

        Map<String, Long> wordCount =list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordCount);

         list.stream().map(a->a+"  "+ a.length()).forEach(System.out::println);

    }
}
