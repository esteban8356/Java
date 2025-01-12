package org.esteban.poointerfaces.repositorio;

import org.esteban.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente c = null;
        for (Cliente cli : dataSource) {
            if (cli.getId().equals(id)) {

            }
        }
        return null;
    }

    @Override
    public void crear(Cliente cliente) {

    }

    @Override
    public void editar(Cliente cliente) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        return List.of();
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return List.of();
    }
}
