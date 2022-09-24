package com.temmytechie.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cup", null, "sugar", "tea", null);

        List<String> results = new ArrayList<String>();

        results = words.stream().filter(e -> e != null).collect(Collectors.toList());

        System.out.println(results);

        words.stream().filter(e -> e != null).forEach(System.out::println);
    }
}
