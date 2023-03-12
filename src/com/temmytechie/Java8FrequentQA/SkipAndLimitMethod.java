package Java8FrequentQA;

import java.util.stream.IntStream;

public class SkipAndLimitMethod {

    public static void main(String[] args) {

        //skip and limit
        IntStream.rangeClosed(1, 10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);
    }
}
