package com.github.osvaldsoza;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> duplicated = number -> number * 2;

        List<Integer> numbersDuplicated = numbers.stream()
                .map(duplicated)
                .toList();

        List<Integer> numbersDuplicated1 = numbers.stream()
                .map(number -> number * 2)
                .toList();

        List<Integer> numbersDuplicated2 = numbers.stream()
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer number) {
                        return number * 2;
                    }
                })
                .toList();

        numbersDuplicated.forEach(System.out::println);
        numbersDuplicated1.forEach(System.out::println);
    }
}
