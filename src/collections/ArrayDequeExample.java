package src.collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque ad= new ArrayDeque();
        ad.add(1);
        ad.add("hello");
        ad.add("sample");
        ad.add("deque");

        ad.push("push");
        ad.offer("offer");
        ad.addFirst("addFirst");
        ad.addLast("addLast");
        ad.offerFirst("offerFirst");
        ad.offerLast("offerLast");

        ad.offerFirst("offerNewFirst");
//        ad.removeFirst();
//        ad.removeLast();
        ad.poll();
        ad.pollFirst();
        ad.pollLast();
        System.out.println(ad);

    }
}
