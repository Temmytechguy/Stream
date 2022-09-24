package com.temmytechie.streammethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Demo4StreamConcatMethod {
    public static void main(String[] args) {

        List<String> animalsList = Arrays.asList("Dog","Cat","Elephant");
        List<String> birdsList = Arrays.asList("Peacock","Dove","Eagle");

        Stream<String> stream1 = animalsList.stream();
        Stream<String> stream2 = birdsList.stream();

        //Concat()
        List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
        for(String item:finalList)
        {
            System.out.println(item);
        }



    }
}
