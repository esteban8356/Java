package org.esteban.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHasSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atun", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        for (String pez : peces) {
            if (!unicos.add(pez)) {
                System.out.println("elemento duplicado " + pez);
            }
        }

        System.out.println(unicos.size() + "ELementos no duplicados " + unicos);
    }

}
