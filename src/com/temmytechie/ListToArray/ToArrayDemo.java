package com.temmytechie.ListToArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);

        System.out.println(list);


        Integer[] arr = list.stream().toArray(size -> new Integer[size]);
        System.out.println(Arrays.toString(arr));




    }
}
