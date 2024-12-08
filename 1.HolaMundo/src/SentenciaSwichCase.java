import java.util.Scanner;

public class SentenciaSwichCase {
    public static void main(String[] args) {

        byte num = 6;

        int mes;
        String nombremes = null;
        Scanner inreso = new Scanner(System.in);

        switch (num) {
            case 0:
                System.out.println("El numero es 0");
                break;
            case 1:
                System.out.println("el numero es 1");
                break;
            case 2:
                System.out.println("el numero es 2");
                break;
            case 3:
                System.out.println("el numero es 3");
                break;

            default:
                System.out.println("numero o caracter desconocido");
        }

        System.out.println("senor usaurio porfavor ingrese el numero del mes: ");
        mes = inreso.nextInt();

        switch (mes) {
            case 1:
                nombremes = "Enero";
                break;
            case 2:
                nombremes = "Febrero";
                break;
            case 3:
               nombremes = "Marzo";
                break;
            case 4:
                nombremes = "Abril";
                break;
            case 5:
                nombremes = "Mayo";
                break;
            case 6:
                nombremes = "Junio";
                break;
            case 7:
                nombremes = "Julio";
                break;
            case 8:
                nombremes = "Agosto";
                break;
            case 9:
                nombremes = "Septiembre";
                break;
            case 10:
                nombremes = "Octubre";
                break;
            case 11:
                nombremes = "Noviembre";
                break;
            case 12:
                nombremes = "Diciembre";
                break;
            default:
                System.out.println("numero desconocido");
        }

        System.out.println("senor usaurio el mes que ingreso es " + nombremes );


    }
}
