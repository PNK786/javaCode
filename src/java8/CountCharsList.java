package src.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharsList
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "hi", "London", "india", "sample");

        Map<Character, Long> frequencyMap = list.stream().flatMap(a -> a.chars().mapToObj(ch -> (char) ch))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        Long maxFrequency  = frequencyMap.values().stream().max(Long::compare).orElse(0L);

        List<Character> mostRepeatedChars  = frequencyMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxFrequency)
                .map(Map.Entry::getKey)
                .toList();


        System.out.println(frequencyMap);
        System.out.println(maxFrequency);
        System.out.println(mostRepeatedChars);

        if (mostRepeatedChars.size() > 1) {
            System.out.println("No match");
        } else {
            System.out.println("Most repeated character: " + mostRepeatedChars.get(0));
        }


    }
}
