package src.collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NonRepeated
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "a", "b", "c");

        Map<String,Integer>countMap=new LinkedHashMap<>();

        for (String s:list)
        {
            countMap.put(s,countMap.getOrDefault(s,0)+1);
        }
        for (Map.Entry<String,Integer>entry:countMap.entrySet()){
            if (entry.getValue()==1){
                System.out.println("First Non repeating:  "+entry.getKey());
                break;
            }
        }
    }
}
