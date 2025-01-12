package org.esteban.poointerfaces.repositorio;

import org.esteban.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo,Direccion dir);

}
