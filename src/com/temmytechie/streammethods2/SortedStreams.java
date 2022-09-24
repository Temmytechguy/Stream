package com.temmytechie.streammethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStreams {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,4,6,1,3,8,0);

        List<Integer> sortedStreams = list1.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedStreams); //ascending order

        //sorted in reverse or descending order
        List<Integer> sortedStreams2 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedStreams2);

        //strings
        List<String> list2 = Arrays.asList("John","Mary","Tim", "David", "Smith");
        List<String> sortedString = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedString);

        //reverse order
        List<String> sortedString2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedString2);




    }
}
