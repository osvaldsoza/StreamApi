package com.github.osvaldsoza;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {

    public static void main(String[] args) {
        Supplier<String> message = () -> "Hello my friend!!!";

//        List<String> messages = Stream.generate(message)
//                .limit(5)
//                .collect(Collectors.toList());

//        List<String> messages = Stream.generate(message)
//                .limit(5)
//                .toList();

//        List<String> messages = Stream.generate(new Supplier<String>() {
//                    @Override
//                    public String get() {
//                        return "";
//                    }
//                })
//                .limit(3)
//                .toList();

        List<String> messages = Stream
                .generate(() -> "Hello world!!!")
                .limit(3)
                .toList();

        // messages.forEach(msg -> System.out.println(msg));
        messages.forEach(System.out::println);

    }
}
