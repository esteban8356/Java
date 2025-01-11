package org.esteban.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro  implements Imprimible{
    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<Imprimible>();
    }

    public Libro addPaginas(Imprimible pagina) {
        paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(titulo);
        sb.append("\nAutor: ");
        sb.append(autor);
        sb.append("\nGenero: ");
        sb.append(genero);
        for (Imprimible pag : paginas) {
            sb.append(pag.imprimir())
            .append("\n");
        }
        return sb.toString();
    }

}
