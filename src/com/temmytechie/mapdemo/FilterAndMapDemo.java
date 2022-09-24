package com.temmytechie.mapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{

    int emId;
    String name;
    int salary;

    public Employee(int emId, String name, int salary)
    {
        this.emId = emId;
        this.name = name;
        this.salary = salary;

    }

}
public class FilterAndMapDemo {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee(101,"Alex", 25000),
                new Employee(102,"Max", 35000),
                new Employee(103,"Steve", 28000),
                new Employee(104,"James", 23000));


        //combination of filter and map
        List<Integer> emplSalaryList = employeeList.stream().filter(emp -> emp.salary > 23000)
                .map(emp -> emp.salary)
                .collect(Collectors.toList());

        System.out.println(emplSalaryList);

        //or this

        employeeList.stream().filter(e -> e.salary > 25000)
                .map(e ->  e.salary).forEach(System.out::println);
    }
}
