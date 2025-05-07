package src.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicatesOncountValue {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", "d", "a", "b", "c","e","f","g");

        Map<String,Integer> countMap=new LinkedHashMap<>();

        for (String s:list)countMap.put(s,countMap.getOrDefault(s,0)+1);
        countMap.entrySet().stream().filter(e->e.getValue()>1)
                .forEach(e-> System.out.println(e.getKey()+"->"+e.getValue()));

        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .forEach(System.out::println);
    }
}