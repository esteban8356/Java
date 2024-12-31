package org.esteban.poosobrecarga;

import java.util.Scanner;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        var a = "5";
        var b = "20";

        System.out.println("sumar int: " + Calculadora.suma(10,5));
        System.out.println("suma de dos flotantes " + Calculadora.suma(10.0F,5F));
        System.out.println("prueba de suma " + Calculadora.suma(a,b));


    }
}
