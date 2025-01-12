package org.esteban.poointerfaces.imprenta;

import org.esteban.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("john doe","ingeniero de sistemas","resumen laboral");
        cv.addExperiencia("java");
        cv.addExperiencia("oracle db");
        cv.addExperiencia("sping framework");
        cv.addExperiencia("angular");
        cv.addExperiencia("desarrolador fullstack");

        Libro libro = new Libro("ERICH GAMMA"
                , "Patrones de deseños : Elem. Reusables POO"
                , Genero.PROGRAMACION );
        libro.addPaginas(new Pagina("Patron Singleton"))
                .addPaginas(new Pagina("Patron observador"))
                .addPaginas(new Pagina("Patron Factory"))
                .addPaginas(new Pagina("Composite"))
                .addPaginas(new Pagina("Patron Fascade"));


        Informe informe = new Informe("martin fowler","james","Estudio de microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);



    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
