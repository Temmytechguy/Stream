package com.company.steammethods;

import java.util.Arrays;
import java.util.List;

public class StreamMethodDemo4 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        Object arr[] = stringList.stream().toArray();
        System.out.println(arr.length);

        for(Object v:arr)
        {
            System.out.println(v);
        }

    }
}
