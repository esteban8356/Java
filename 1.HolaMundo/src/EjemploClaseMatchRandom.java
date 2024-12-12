import java.util.Random;

public class EjemploClaseMatchRandom {
    public static void main(String[] args) {


        String[] colores = {"red", "blue", "green", "yellow", "orange", "pink"};
        double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length ;

        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int)random]);


        Random randomObj = new Random();

        int RandomInt = randomObj.nextInt(25);
        System.out.println("random = " + RandomInt);

        RandomInt = randomObj.nextInt(colores.length) ;
        System.out.println("colores = " + colores[RandomInt]);

    }
}
