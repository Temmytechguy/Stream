package com.company.ParallelStream;

import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
public class ParallelStreamDemo {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student("Temmy",90),
                new Student("Janet", 85),
                new Student("Michale", 84),
                new Student("Porter", 75),
                new Student("Sherleane", 64),
                new Student("John", 89),
                new Student("Kennedy", 60),
                new Student("Barack", 88));

        //using sequential stream
        studentList.stream().filter(student -> student.getScore()>80)
                .limit(3)
                .forEach(
                student -> System.out.println(student.getName() + " " + student.getScore()));

        //using parallel stream

        studentList.parallelStream().filter(student -> student.getScore()>80)
                .limit(3)
                .forEach(
                        student -> System.out.println(student.getName() + " " + student.getScore()));


        //converting sequential stream() --> to parallelStream()
        studentList.stream().parallel().filter(student -> student.getScore()>80)
                .limit(3)
                .forEach(
                        student -> System.out.println(student.getName() + " " + student.getScore()));




    }


}
