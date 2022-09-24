package com.company.streammethods2;

//anymatch()
//allMatch()
//noneMatch()

import java.util.HashSet;
import java.util.Set;

public class AnyMatchStreams {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<String>();

        fruits.add("One Apple");
        fruits.add("Two Mango");
        fruits.add("Two Apple");
        fruits.add("More Grapes");
        fruits.add("One Guava");

        //AnyMatch() 1value should match
        boolean result = fruits.stream().anyMatch(value -> {return value.startsWith("One");});
        System.out.println(result);

        //AllMatch() every value should match
        boolean result2 = fruits.stream().allMatch(value -> {return value.startsWith("One");});
        System.out.println(result2);

        //NoneMatch()
        boolean result3 = fruits.stream().noneMatch(value -> {return value.startsWith("One");});
        System.out.println(result3);






    }
}
