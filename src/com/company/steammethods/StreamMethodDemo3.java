package com.company.steammethods;

//reduce()


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethodDemo3 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        //reduce all element into one single collection
        Optional<String> reduced = stringList.stream().reduce((value, combinedValue) ->
                        {
                                    return value + combinedValue ;

                                });

        System.out.println(reduced.get());



    }
}
