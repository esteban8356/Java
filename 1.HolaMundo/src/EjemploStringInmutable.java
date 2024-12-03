public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso = "programacion java";
        String profesor = "esteban muñoz garcia";

        String detalle = curso.concat(profesor);

        System.out.println("curso = " + curso);
        System.out.println("detalle = " + detalle);

        String resultado2 = curso.transform(c ->{
            return  c + " con " + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado2.replace("a","A");
        System.out.println("resultado3 = " + resultado3);
    }
}
