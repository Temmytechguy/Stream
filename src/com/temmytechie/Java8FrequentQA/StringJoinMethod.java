package Java8FrequentQA;

import java.util.Arrays;
import java.util.List;

public class StringJoinMethod {
    public static void main(String[] args) {

        List<String> listStr = Arrays.asList("1", "2", "3", "4");

        String results  = String.join("-", listStr);
        System.out.println(results);


    }
}
