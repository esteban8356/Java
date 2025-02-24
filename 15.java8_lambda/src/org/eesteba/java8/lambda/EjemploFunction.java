package org.eesteba.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Hola que tal " + param;
        String resulrado = f1.apply("Esteban");
        System.out.println(resulrado);


        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("Esteban"));


        BiFunction<String, String, String> f3 = (a,b)  -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("andres","jose");
        System.out.println(r2);

        BiFunction<String,String,Integer> f4 = (a,b) -> a.compareTo(b);
        System.out.println(f4.apply("esteban","jose"));
    }
}



