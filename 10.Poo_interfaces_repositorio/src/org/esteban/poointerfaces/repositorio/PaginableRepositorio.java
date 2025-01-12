package org.esteban.poointerfaces.repositorio;

import org.esteban.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar (int desde,int hasta);
}
