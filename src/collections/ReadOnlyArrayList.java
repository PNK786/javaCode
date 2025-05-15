package src.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayList
{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(9, 8, 7, 4, 90, 12);
        List<Integer> integersReadOnly = Collections.unmodifiableList(list);

//        integersReadOnly.add(25);

        System.out.println(integersReadOnly);

        List<String> readOnly = List.of("A", "B", "C");

        System.out.println(readOnly);
    }
}
