public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "programacion java";
        String profesor = "esteban muñoz garcia";

        String detalle ="curso : " + curso +" \nprofesor : " + profesor;

        System.out.println("detalle = " + detalle);
        
        String detalle2 = curso.concat(profesor);
        System.out.println("detalle2 = " + detalle2);

    }
}
