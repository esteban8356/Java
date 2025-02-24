package org.eesteba.java8.lambda;

import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;
        boolean result = test.test(7);
        System.out.println("result = " + result);
        Predicate<String> test2 = role -> role.equals("admin");
        System.out.println("test2.test(\"admin\") = " + test2.test("admin"));
    }
}
