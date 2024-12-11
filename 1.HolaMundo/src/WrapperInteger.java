public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = 32768;
        System.out.println("intObjeto = " + intObjeto);
        int num = intObjeto;
        int num2 = intObjeto.intValue();
        System.out.println("intObjeto = " + intObjeto);
    }
}
