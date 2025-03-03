package org.esteban.pooexepciones.ejemplo;

public class Calculadora {

    public double dividir (int numerador, int divisor) throws ArithmeticException, DivisionPorZeroException {
       if(divisor == 0) {
           throw new DivisionPorZeroException("No se puede dividir por zero");
       }

        return numerador / (double) divisor;
    }

    public double dividir(String numerador, String divisor)
            throws DivisionPorZeroException, FormatoNumeroException  {
       try {
           int num = Integer.parseInt(numerador);
           int div = Integer.parseInt(divisor);
           return this.dividir(num,div);
       }catch (NumberFormatException e) {
           throw new FormatoNumeroException("debe ingresar un numero en numerador y divisor");
       }
    }
}
