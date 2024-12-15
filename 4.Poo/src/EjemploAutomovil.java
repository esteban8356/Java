public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("blanco");
        Automovil mazda = new Automovil("Mazda","BT-50","Rojo",3.0);

        Automovil nissan = new Automovil("Nissan","Navara","Gris oscuro",3.5, 50);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println("-------------------------------");
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println("Kilometros recorridos por litro "+ subaru.calcularConsumo(300,0.6f));

        System.out.println("Kilometros recorridos por litro "+ subaru.calcularConsumo(300,60));
        System.out.println("Kilometros recorridos por litro "+ nissan.calcularConsumo(300,60));

    }
}
