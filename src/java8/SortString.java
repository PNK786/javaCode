package src.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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

        Map<Character, List<String>> collect = sortedList.stream()
                .collect(Collectors.groupingBy(sort -> sort.charAt(0)));


        System.out.println(sorted(sortedList));
        System.out.println(collect);
    }

//    public static Map<String, List<String>>groupByChar(List<String> sort)
//    {
//        Map<String, List<String>> collect = sort.stream()
//                                              .collect(Collectors.groupingBy(Function.identity()));
//
//        return collect;
//    }
}
