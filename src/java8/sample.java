package src.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sample
{
    public static void main(String[] args) {

        List<Integer> al= new ArrayList<>();

        al.add(5);
        al.add(15);
        al.add(52);
        al.add(45);
        al.add(25);

        al.set(3,39);

        System.out.println(al);

        List<Integer> list=Arrays.asList(5,8,6,9);

        list.set(2,12);

        System.out.println(list);

        List.of();

    }
}
