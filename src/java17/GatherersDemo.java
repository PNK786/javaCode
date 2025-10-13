package src.java17;

import java.util.List;

public class GatherersDemo
{
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 25, 12,29);
        Integer reduce = numbers.stream().reduce(0, (a, e) -> a + e);

        System.out.println(reduce);

    }
}
