public class PasarPorValor {
    public static void main(String[] args) {
        int i = 20;

        System.out.println("iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("finaliza el metodo main con el valor de i = " + i);
    }

    public static void test (int i) {
        System.out.println("Iniciamos el metodo test co i = " + i );
        i = 35;
        System.out.println("fianlizamos el metodo text con i = " + i);
    }
}
