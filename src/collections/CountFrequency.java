package src.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequency
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "banana", "orange", "pomegranate", "apple", "banana", "papaya");
        Map<String,Integer>map=new HashMap<>();

        for (String item:list){
            map.put(item,map.getOrDefault(item,0)+1);
        }
        System.out.println(map);

    }
}
