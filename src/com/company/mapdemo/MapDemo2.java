package com.company.mapdemo;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        //before java8/without using streams

        for(String name:vehicles)
        {
            System.out.println(name.length());
        }

        vehicles.stream().map(name -> name.length()).forEach(name -> System.out.println(name));
        vehicles.stream().map(name -> name.length()).forEach(System.out::println);


    }
}
