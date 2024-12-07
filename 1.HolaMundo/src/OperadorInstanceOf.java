public class OperadorInstanceOf {
    public static void main(String[] args) {

        Object  texto = "Creando un objeto de la clase String";

        Object num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo string = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);
    }
}
