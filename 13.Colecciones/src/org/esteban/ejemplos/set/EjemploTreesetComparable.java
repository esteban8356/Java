package org.esteban.ejemplos.set;

import org.esteban.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreesetComparable {
    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();

        sa.add(new Alumno("pato",5));
        sa.add(new Alumno("cata",6));
        sa.add(new Alumno("luci",4));
        sa.add(new Alumno("jano",7));
        sa.add(new Alumno("andres",3));
        sa.add(new Alumno("zeus",2));

        System.out.println(sa);
    }
}
