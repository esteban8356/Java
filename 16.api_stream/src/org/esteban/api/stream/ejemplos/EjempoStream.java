package org.esteban.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjempoStream {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Alice", "Bob", "Carlos", "Dave");
        nombres.forEach(System.out::println);

        String[] arr = {"Alice", "Bob", "Carlos"};
        Stream.of(arr).forEach(System.out::println);
    }

}
