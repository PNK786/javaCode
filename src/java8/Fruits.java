package src.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Fruits
{
    public static void main(String[] args) {
        List<String>fruits= Arrays.asList("apple", "banana", "Avocado", "grape", "apricot");
        List<Integer> list = Arrays.asList(10, 5, 20, 8, 20, 15);
        List<Integer>duplicate=Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);

        List<String> a1 = fruits.stream()
                           .filter(a ->a.toLowerCase().startsWith("a")).sorted().toList();

        System.out.println(a1);

       list.stream().
                distinct()
               .sorted(Comparator.reverseOrder()).skip(1)
               .findFirst().orElseThrow();

        Set<Integer>set=new HashSet<>();




        Set<Integer> collect = duplicate.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());

        System.out.println(collect);

    }
}
