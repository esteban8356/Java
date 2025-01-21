package org.esteban.ejemplos.set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashsetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));

        System.out.println(hs);

        boolean B = hs.add("tres");
        System.out.println(hs);
        System.out.println("PERMITE ELEMENTOS DUPLICADOS: " + B);
    }
}
