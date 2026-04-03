package src.CodeDecode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Parallel
{
    public static void main(String[] args) {
         List<Integer>list =new ArrayList<>();

        IntStream.range(0,1001).parallel().forEach(System.out::println);
    }
}
