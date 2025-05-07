package src.collections;

import java.util.*;

public class SecondHighest
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 71, 64, 87, 21, 56, 99);

        Set<Integer>treeSet= new TreeSet<>(list);
        List<Integer>sortedList= new ArrayList<>(treeSet);
        System.out.println(sortedList.get(sortedList.size()-2));
    }
}
