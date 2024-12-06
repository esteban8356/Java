public class OperadoresIncrementables {
    public static void main(String[] args) {

        // pre incremento
        System.out.println("pre incremento");
        int i = 1;
        int j = ++i; // esto incrementa la variable en 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post incremento
        System.out.println("post incremento");
        i = 2;
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);



        //post decremento
        System.out.println("pre decremento");
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);




    }
}
