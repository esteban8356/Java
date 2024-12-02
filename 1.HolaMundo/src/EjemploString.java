public class EjemploString {
    public static void main(String[] args) {

        String curso = "programacion java";
        String curso2 = new String("programacion java");

        boolean esIgual = curso ==curso2;
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

        String curso3 = "programacion java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);

    }
}
