package com.github.osvaldsoza;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // option 1
//       Consumer<Integer> printNumber = number ->{
//           if(number % 2 == 0){
//               System.out.println(number);
//           }
//       };
//
//       numbers.forEach(printNumber);

        // option 2
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        });

        // option 3
        numbers.stream()
                .filter(number -> number % 2  == 0)
                .forEach(System.out::println);

        //option 4
        numbers.forEach(ConsumerExemplo::verifyNumber);

    }

    private static void verifyNumber(Integer number) {
        if (number % 2 == 0) {
            System.out.println(number);
        }
    }
}
