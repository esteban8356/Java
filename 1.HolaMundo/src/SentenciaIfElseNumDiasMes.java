import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        int numDias = 0 , mes = 0, anio = 2020;

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese el numero de mes: ");
        mes = ingreso.nextInt();
        System.out.println("senor usuario porfavor ingrese el ano ");
        anio = ingreso.nextInt();

        // Verifica los meses con 31 días
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numDias = 31;
        }
        // Verifica los meses con 30 días
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numDias = 30;
        }
        // Verifica febrero
        else if (mes == 2) {
            // Condición para verificar si el año es bisiesto
            if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
                numDias = 29;
            } else {
                numDias = 28;
            }
        }

        // Imprime el número de días del mes
        System.out.println("numDias = " + numDias);
    }
}
