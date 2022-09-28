package com.temmytechie.steammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxAndMinMethod {

    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Count
        long evenNumbers = numbersList.stream().filter(even -> even%2==0).count();
        System.out.println(evenNumbers);

        //Min (non terminal Method)
        Optional<Integer> min = numbersList.stream().min((val1, val2) -> {
            return val1.compareTo(val2);});

        System.out.println("Minimum Value is : " + min.get());

        //Max
        Optional<Integer> max = numbersList.stream().max((val1, val2) -> {
            return val1.compareTo(val2);});

        System.out.println("Maximum number is :" + max.get());




    }
}
