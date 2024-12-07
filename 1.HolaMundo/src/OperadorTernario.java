import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //varaible = condicion ? si es verdadero : si es falso

        String varible = 7 == 7 ? "verdadero" : "falso";
        System.out.println(varible);

        String estado = "";
        double promedio = 0.0,
        matematicas = 0.0,
        ciencias = 0.0,
        historia = 0.0 ;

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese el valor de matemaicas: ");
        matematicas = ingreso.nextDouble();
        System.out.println("Ingrese el valor de ciencias: ");
        ciencias = ingreso.nextDouble();
        System.out.println("Ingrese el valor de historia: ");
        historia = ingreso.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "aprobado" : "rechazado";
        System.out.println("estado = " + estado +"\n"+ "promedio = " + promedio);

    }
}
