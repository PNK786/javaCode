package src.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class People {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Person> personList = Arrays.asList(
                new Person("A", "Hyd", 25),
                new Person("B", "Delhi", 30),
                new Person("C", "Hyd", 22),
                new Person("D", "Delhi", 28),
                new Person("E", "Hyd", 34)
        );

        String s = personList.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.counting()))
                .entrySet().stream().
                max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();

        System.out.println(s);


       Map<Boolean,List<Integer>> partitioned=list.stream().collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println(partitioned);

    }
}
