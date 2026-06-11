package src.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mostrepeated
{
    public static void main(String[] args) {

        List<String> list = Arrays.asList("london", "europe", "france", "paris", "paris", "france", "france");

        Map.Entry<String, Long> stringLongEntry = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().max(Map.Entry.comparingByValue()).orElse(null);


        System.out.println(stringLongEntry);
    }
}
