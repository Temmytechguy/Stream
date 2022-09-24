package com.company.steammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//non-terminal/processing method
//distinct()
//limit()

//terminal methods
//count()
//forEach()

public class StreamMethodDemo1 {

    public static void main(String[] args) {

        List<String> vehiclesList = Arrays.asList("bus", "car", "bicycle", "car","bus","car","bike");

        //distinct  method
        List<String> distinctVehicles = vehiclesList.stream().distinct().collect(Collectors.toList());
        //System.out.println(distinctVehicles);

         vehiclesList.stream().distinct().forEach(value -> System.out.println(value));

         //count
        long count = vehiclesList.stream().distinct().count();
        System.out.println(count);

        //limit

        List<String> limitedVehiclesList = vehiclesList.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited Vehicles: " + limitedVehiclesList);

        vehiclesList.stream().limit(3).forEach(value -> System.out.println(value));






    }
}
