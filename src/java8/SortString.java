package src.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortString
{
    public static List<String> sorted(List<String> sort){
       return sort.stream()
               .sorted(Comparator.comparingInt(
                       String::length).thenComparing(Comparator.naturalOrder()))
                       .toList();
    }

    public static void main(String[] args) {
        List<String>sortedList =List.of("hi","whatsApp","first","last","hello");


        System.out.println(sorted(sortedList));
        groupByChar(sortedList);

    }

    public static Map<Character, List<String>> groupByChar(List<String> sort)
    {
        Map<Character, List<String>> collect = sort.stream()
                .collect(Collectors.groupingBy(sorted -> sorted.charAt(0)));

        return collect;
    }
}
