package com.temmytechie.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo1 {


    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        List<String> vehiclesAsUpperCase = new ArrayList<String>();

        //before java8 without using streams
        /**
        for(String name:vehicles)
        {
            vehiclesAsUpperCase.add(name.toUpperCase());
        }

        System.out.println(vehiclesAsUpperCase);
        **/

        //stream - map

        vehiclesAsUpperCase = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesAsUpperCase);

    }
}
