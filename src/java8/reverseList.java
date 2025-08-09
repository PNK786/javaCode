package src.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class reverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 8, 2, 10, 12);

        List<Integer> reversed = new ArrayList<>();
//          list.stream().
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        System.out.println(reversed);

        List<Integer> ListReversed = list.stream().collect(Collectors.collectingAndThen(Collectors.toList(), reverselist -> {
            Collections.reverse(list);
            return list;
        }));

        System.out.println(ListReversed);

    }
}

