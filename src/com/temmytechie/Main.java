package com.temmytechie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        ArrayList<Integer> numbersList = new ArrayList<Integer>();
//
//        numbersList.add(10);
//        numbersList.add(20);
//        numbersList.add(30);
//        numbersList.add(40);
//        numbersList.add(50);

        List<Integer> numbersList2 = Arrays.asList(10, 15,20,25, 30,40,50);

        List<Integer> evenNumbersList = new ArrayList<Integer>();

        //collect the data and store it in another collection
        evenNumbersList = numbersList2.stream().filter(e -> e%2==0).collect(Collectors.toList());
        System.out.println(evenNumbersList);

        //filyter takes prediczte and forEach method takes consumer method ambda expression
        numbersList2.stream().filter(e -> e%2==0).forEach(e -> System.out.println(e));

        System.out.println("------------");
        //another method to do as above
        numbersList2.stream().filter(e -> e%2==0).forEach(System.out::println);




    }
}
