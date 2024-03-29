package com.github.osvaldsoza;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        BinaryOperator<Integer> sum = Integer::sum; // => BinaryOperator<Integer> sum = (number1,number2) -> number1 + number2;

        int totalSum = numbers.stream().reduce(0, sum);
        int totalSum1 = numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer n1, Integer n2) {
                return n1 + n2;
            }
        });

        int totalSum2 = numbers.stream().reduce(0, Integer::sum);

        System.out.println(totalSum);
        System.out.println(totalSum1);
        System.out.println(totalSum2);
    }
}
