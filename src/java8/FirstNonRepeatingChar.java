package src.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar
{
    public static void main(String[] args) {
        String input="swiss";

        Map.Entry<String, Long> FirstUnique = Arrays.stream(input.split("")).collect(Collectors.groupingBy(
                        Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1).findFirst().orElseThrow(null);

        System.out.println(FirstUnique);
    }
}
