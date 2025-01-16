package org.esteban.generics;

import org.esteban.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ElemploGenericos {
    public static void main(String[] args) {

        List clientes = new ArrayList();
        clientes.add(new Cliente("Andres","Guzman"));

        Cliente andres = (Cliente) clientes.iterator().next();
    }
}
