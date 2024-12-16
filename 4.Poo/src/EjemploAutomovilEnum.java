public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.AMARILLO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.AZUl, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.AMARILLO,3.5, 50);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil.colorPatente = Color.AZUl;
        System.out.println( "Velocidad Maxima Carretera "+ Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad Maxima Ciudad "+ Automovil.VELOCIDAD_MAX_CIUDAD);
        Automovil auto = new Automovil();


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());


    }
}
