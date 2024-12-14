import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] Productos = new String[7];

        Productos[0] = "Kingston pendrive 64GB";
        Productos[1] = "Samsung Galaxy S6";
        Productos[2] = "Disco Dur SSD Sansung Externo";
        Productos[3] = "Asus Notebook";
        Productos[4] = "Macbook Air";
        Productos[5] = "Chromecast 4ta generacions";
        Productos[6] = "Bicicleta oxford";

        Arrays.sort(Productos); // oganiza el arreglo en orden alfa numerico

        String prod1 = Productos[0];
        String prod2 = Productos[1];
        String prod3 = Productos[2];
        String prod4 = Productos[3];
        String prod5 = Productos[4];
        String prod6 = Productos[5];
        String prod7 = Productos[6];

        System.out.println("Productos = " + prod1);
        System.out.println("Productos = " + prod2);
        System.out.println("Productos = " + prod3);
        System.out.println("Productos = " + prod4);
        System.out.println("Productos = " + prod5);
        System.out.println("Productos = " + prod6);
        System.out.println("Productos = " + prod7);

        int[] numeros = new int[4];


        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
