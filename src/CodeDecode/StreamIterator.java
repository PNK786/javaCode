package src.CodeDecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIterator
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 8, 6, 1, 2, 81, 36, 78, 12, 45);

//        list.add(99);
//        list.stream().forEach(x->list.add(x));
//         List<Integer>result=new ArrayList<>();
//        list.stream().forEach(result::add);
//        System.out.println(list);

//        boolean b = list.removeIf(x -> x < 5);

//        System.out.println(b);

        list.stream().map(x -> {
            System.out.println(x);
            return x * 2;
        }).toList();
//        .forEach(System.out::println);
    }
}
