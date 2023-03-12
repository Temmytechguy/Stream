package Java8FrequentQA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllElementInArrayStartingWithOne {
    public static void main(String[] args) {

        int[] numbers = {2,3,11,21,1,29};

        List<String> strList = Arrays.stream(numbers).boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("2"))
                .collect(Collectors.toList());

        System.out.println(strList);
    }
}
