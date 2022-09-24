package com.company.flatmapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);

        List<Integer> list2 = list1.stream().map(e ->  e+10).collect(Collectors.toList());
        System.out.println(list2);

        //flatMap()
        List<Integer> list6 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list3 = Arrays.asList(1, 2);
        List<Integer> list4 = Arrays.asList(3, 4);
        List<Integer> list5 = Arrays.asList(5, 6);

        List<List<Integer>> finalList = Arrays.asList(list3, list4, list5, list6);

        List<Integer> finalresult = finalList.stream()
                .flatMap(e -> e.stream().map(n -> n+10))
                .collect(Collectors.toList());

        System.out.println(finalresult);






    }

}
