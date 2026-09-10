package src;

import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMap
{
    public static void main(String[] args) {
        ConcurrentHashMap  cmap= new ConcurrentHashMap<>(12, 0.5F);

        StringBuilder  sb= new StringBuilder("java code");
        System.out.println(sb.capacity());
    }
}
