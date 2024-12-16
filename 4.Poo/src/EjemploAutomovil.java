public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,3.0);

        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,3.5, 50);
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS,3.5, 50);
        Automovil auto = new Automovil();

        System.out.println(nissan == nissan2);
        System.out.println(nissan.equals(nissan2));
        System.out.println(auto == nissan);
        System.out.println(nissan);

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
