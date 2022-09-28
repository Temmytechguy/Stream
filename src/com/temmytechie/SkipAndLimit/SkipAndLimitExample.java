package com.temmytechie.SkipAndLimit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SkipAndLimitExample {
    public static void main(String[] args) throws IOException {

        List<String> fileDtata = Files.readAllLines(Paths.get("data.txt"));

        fileDtata.stream().skip(1)
                .limit(fileDtata.size()-2)
                    .forEach(System.out::println);



    }
}
