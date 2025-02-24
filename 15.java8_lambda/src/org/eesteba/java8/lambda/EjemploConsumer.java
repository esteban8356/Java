package org.eesteba.java8.lambda;

import org.eesteba.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumir =fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(f.format(fecha));
        };
        consumir.accept(new Date());

        BiConsumer<String, Integer> consomidorBi = (nombre, edad)->{
            System.out.println(nombre+" tiene "+edad+" anos de edad");
        };
        consomidorBi.accept("pepe",20);

        Consumer<String> consomidor2 = System.out::println;
        consomidor2.accept("Hola mundo lamda");

        List<String> nombres = Arrays.asList("Juan", "Pedro", "Maria");
        nombres.forEach(System.out::println);

        Usuario usaurio = new Usuario();

        BiConsumer<Usuario, String>asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usaurio, "Juan");
        System.out.println("Nombre usaurio " + usaurio.getNombre());

        Supplier<String> proveedor = () ->{
            return  "Hola mundo lambda supplier";
        };
        System.out.println(proveedor.get());
    }
}
