public class EjemploStrinValider {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        boolean esVacio = !esNulo && curso.isEmpty();

        System.out.println("esNulo = " + esNulo);

        if (!esNulo && !esVacio) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        } else if (esNulo) {
            System.out.println("El curso es nulo.");
        } else {
            System.out.println("El curso está vacío.");
        }
    }
}
