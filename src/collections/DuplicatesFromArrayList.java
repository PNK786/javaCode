package src.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesFromArrayList
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5);
        Set<Integer>set=new LinkedHashSet<>(list);

        System.out.println(set);
    }
}
