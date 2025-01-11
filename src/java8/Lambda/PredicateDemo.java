package src.java8.Lambda;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo
{
    public static void main(String[] args) {

        PredicateDemo predicateDemo = new PredicateDemo();
       multiply multiply = (a,b)->a*b;

        System.out.println(multiply.mul(5,8));

        List<Integer> list=Arrays.asList(3,5,7,9,12,45,77,66,25);

        list.stream().filter(n->n%2==0).forEach(a-> System.out.println(a));

        
    }
}
