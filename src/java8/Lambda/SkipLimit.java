package src.java8.Lambda;

import java.util.Arrays;
import java.util.List;

public class SkipLimit
{
    public static void main(String[] args) {
        List<Integer>skipNum =Arrays.asList(12,24,26,15,84,36,88,75);

        int skip=skipNum.stream().reduce(0,(a,e)->a+e);
        System.out.println(skip);

        skipNum.stream().skip(3).limit(2).forEach(a-> System.out.println(a));
    }
}
