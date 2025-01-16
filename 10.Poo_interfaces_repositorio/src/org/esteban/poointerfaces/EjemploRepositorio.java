package org.esteban.poointerfaces;

import org.esteban.poointerfaces.modelo.Cliente;
import org.esteban.poointerfaces.repositorio.ClienteListRepositorio;
import org.esteban.poointerfaces.repositorio.CrudRepositorio;
import org.esteban.poointerfaces.repositorio.PaginableRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "perez"));
        repo.crear(new Cliente("Bea", "Gonzales"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Andres", "Gusman"));


        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1,3);
    }
}
