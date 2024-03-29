package com.github.osvaldsoza;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {

    public static void main(String[] args) {
        List<String> languagens = Arrays.asList("Java", "Kotlin", "PHP", "C#", "Python", "Ruby", "GoLang");

        Predicate<String> getWordsGreat5Letters = word -> word.length() > 5;

        languagens.stream()
                .filter(getWordsGreat5Letters)
                .forEach(System.out::println);

        System.out.println("---------------");

        languagens.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() > 5;
                    }
                })
                .forEach(System.out::println);

        System.out.println("---------------");

        languagens.stream()
                .filter(language -> language.length() <= 2)
                .forEach(System.out::println);

        System.out.println("---------------");
    }
}
