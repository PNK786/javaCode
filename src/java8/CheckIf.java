package src.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckIf {
    public static void main(String[] args) {

        int[] sample={2,3,4,5,2,3,4,4,6,6,5,5,8,8,8,8,6,6};


        List<Integer> evens= IntStream.of(sample)
                .filter(a->a%2==0)
                .boxed()
                .toList();


        Map<Integer, Long> freqMap = evens.stream()
                .collect(Collectors.groupingBy(a -> a, Collectors.  counting()));

        System.out.println(freqMap);


        Integer i = freqMap.entrySet()
                .stream()
                .sorted(Comparator.comparingLong(Map.Entry<Integer, Long>::getValue).reversed()
                        .thenComparingInt(Map.Entry::getKey))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);

        System.out.println(i);

    }
}
