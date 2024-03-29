package com.github.osvaldsoza.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//    Desafio 2 - Imprima a soma dos números pares da lista:
//    Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
public class Desafio1 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .sorted(Comparator.naturalOrder())
                .distinct()
                .forEach(System.out::println);
    }
}
