package com.company;

import java.util.Arrays;
import java.util.List;

interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}
public class Main {

    //never write . more than once in one line
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers.stream()
                .filter(e->e % 2==0)
                .mapToInt(e->e*2)
                .sum());
    }
}
