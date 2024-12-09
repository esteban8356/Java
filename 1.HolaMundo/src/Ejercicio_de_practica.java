import java.util.Scanner;

public class Ejercicio_de_practica {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        int numeroMin = 99999999;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = in.nextInt();
            if (numeros[i] < numeroMin) {
                numeroMin = numeros[i];
            }
        }

        if (numeroMin >= 10){
            System.out.println("El numero es mayor o igual 10");

        }else{
            System.out.println("El numero es menor que 10");
        }

        }

    }

