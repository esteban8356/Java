package org.esteban.poosobrecarga;

public class Calculadora {

    private Calculadora() {
    }

    public static int suma (int a, int b){
        return a + b;
    }

    public static float suma (float a, float b){
        return a + b;
    }

    public static float suma (int a, float b){
        return a + b;
    }

    public static float suma (float a, int b){
        return a + b;
    }

    public static double suma (double a, double b){
        return a + b;
    }
    public static int suma (String a, String b) {
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }

    public static int suma (int a, int b, int c){
        return a+b+c;
    }


}
