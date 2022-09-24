package com.company.streammethods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny()
//findFirst()
public class Demo3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one","two","three","four");

        Optional<String> element = stringList.stream().findAny();

        System.out.println(element);
    }
}
