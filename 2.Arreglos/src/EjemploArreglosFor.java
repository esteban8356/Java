import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] Productos = new String[7];
        int count = Productos.length;

        Productos[0] = "Kingston pendrive 64GB";
        Productos[1] = "Samsung Galaxy S6";
        Productos[2] = "Disco Dur SSD Sansung Externo";
        Productos[3] = "Asus Notebook";
        Productos[4] = "Macbook Air";
        Productos[5] = "Chromecast 4ta generacions";
        Productos[6] = "Bicicleta oxford";

        Arrays.sort(Productos); // oganiza el arreglo en orden alfa numerico

        for (int i = 0; i < count ; i++) {
            System.out.println("para indice = " + i + " producto = " + Productos[i]);
        }


        int[] numeros = new int[10];
        int total = numeros.length;

        for (int i = 0; i < total ; i++) {
            numeros [i] = i*5;
        }

        for (int i = 0; i < total ; i++) {
            System.out.println("numeros = " + numeros[i]);
        }

        for (int i = count-1; i >= 0 ; i--) {
            System.out.println("para indice = " + i + " producto = " + Productos[i]);
        }


    }
}
