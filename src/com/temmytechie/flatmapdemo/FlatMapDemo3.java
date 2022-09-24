package com.temmytechie.flatmapdemo;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{

    String name;
    int sid;
    char grade;

    public Student(String name, int sid, char grade) {
        this.name = name;
        this.sid = sid;
        this.grade = grade;
    }
}
public class FlatMapDemo3 {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student("John",901, 'A'),
                new Student("Phil", 903, 'B'),
                new Student("Mathew", 907, 'B'),
                new Student("Temmy", 920, 'A'),
                new Student("Sandra", 930, 'C'),
                new Student("Parker", 987, 'C'));

        List<Student> studentList2 = Arrays.asList(new Student("Scott",923, 'A'),
                new Student("Mary", 924, 'B'),
                new Student("Janet", 927, 'A'),
                new Student("Tim", 928, 'A'),
                new Student("Selma", 929, 'C'),
                new Student("Paula", 931, 'C'));

        List<List<Student>> allStudents = Arrays.asList(studentList, studentList2);

       //Before java8

        for(List<Student> students: allStudents)
        {
            for(Student aStudent:students)
            {
                System.out.println(aStudent.name);
            }
        }

        //flatmap
        List<String> studentNames = allStudents.stream()
                .flatMap(students -> students.stream())
                .map(student -> student.name)
                .collect(Collectors.toList());
        System.out.println(studentNames);





    }
}
