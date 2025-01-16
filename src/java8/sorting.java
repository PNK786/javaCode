package src.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class sorting {
    public static void main(String[] args) {
        List<Integer> sort = Arrays.asList(12, 24, 26, 15, 84, 36, 88, 75);
        List<Integer> secondLargeUnique = Arrays.asList(12, 3, 11,4,4,3, 2, 5);
        sort.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Optional<Integer> secondlargestNumber = findSecondlargestNumber(secondLargeUnique);

        System.out.println(secondlargestNumber);

        Optional<Integer> list = sort.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        System.out.println(list);

    }

    public static Optional<Integer>findSecondlargestNumber(List<Integer> second)
    {
        Map<Integer, Long> frequencyMap = second.stream()
                                                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println(frequencyMap);

        // Filter unique numbers and sort in descending order
         List<Integer> uniqueNumbers = frequencyMap.entrySet().stream()
                                                   .filter(entry -> entry.getValue() == 1)
                                                    .map(Map.Entry::getKey)
                                                    .sorted(Comparator.reverseOrder())
                                                    .collect(Collectors.toList());
        System.out.println(uniqueNumbers);
         // Find the second largest unique number
         return uniqueNumbers.size() > 1 ? Optional.of(uniqueNumbers.get(1)) : Optional.empty(); }
    }

