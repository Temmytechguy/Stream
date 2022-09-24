package com.company.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Melinda", "sandra", "sophie", "tiwa");

        names.stream().filter(e -> e.length() > 6 && e.length() < 8).forEach(System.out::println);
        names.stream().filter(e -> e.length() > 6 && e.length() < 8).forEach(e -> System.out.println(e));

        List<String> longestName = names.stream().filter(e -> e.length() > 6 && e.length() < 8).collect(Collectors.toList());
        System.out.println(longestName);

    }
}
