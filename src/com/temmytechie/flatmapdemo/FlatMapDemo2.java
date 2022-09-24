package com.temmytechie.flatmapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

    public static void main(String[] args) {

        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamB = Arrays.asList("Mary", "Luna", "Mark");
        List<String> teamC = Arrays.asList("Tony", "Sam", "Kitty");

        List<List<String>> players = new ArrayList<List<String>>();

        players.add(teamA);
        players.add(teamB);
        players.add(teamC);

        //Before java8
/**
        for(List<String> names: players)
        {
            for(String name : names)
            {
                System.out.println(name);
            }
        }
**/
        //using streams flatmap
        //players.stream().flatMap(team -> team.stream()).forEach(System.out::println);
        List<String> namesOfPlayers = players.stream().flatMap(team -> team.stream()).collect(Collectors.toList());
        System.out.println(namesOfPlayers);

    }
}
