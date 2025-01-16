package org.esteban.generics;

import org.esteban.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres","Guzman"));

        Cliente andres = clientes.iterator().next();
        Cliente[] clientesarreglo = {new Cliente("luci","martinez"),
        new Cliente("esteban","munoz")};
        Integer[] enterosarreglo = {1,2,3};

        List<Cliente> clienteslista = formArrayToList(clientesarreglo);

        clienteslista.forEach(System.out::println);
    }

    public static List<Cliente> formArrayToList(Cliente[] c) {
        return Arrays.asList(c);
    }
}
