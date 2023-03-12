package Java8FrequentQA;

import java.util.Arrays;

public class LongestStringFromAnArray {
    public static void main(String[] args) {

        String[] strArray = {"java", "tech", "microservices", "small", "amazonweb services"};

        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();

        System.out.println(longestString);
    }
}
