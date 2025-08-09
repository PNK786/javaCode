package src.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class frequency
{
    public static void main(String[] args) {
        String input="Afrozkhan";

        Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().forEach(entry-> System.out.println(entry.getKey()+" : "+(entry.getValue()%2==0?"Afroz" : "Khan")));



    }
}
