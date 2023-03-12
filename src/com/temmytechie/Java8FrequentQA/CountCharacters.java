package Java8FrequentQA;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacters {


    public static void main(String[] args) {

        String input= "iloveJavaByTemmytech";

        Map<String, Long> result = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);


    }
}
