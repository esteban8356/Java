import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
    Calendar calendario = Calendar.getInstance();  //al ser un metodo apstracto no se le pone el new para crear una instancia de el

       // calendario.set(2020,Calendar.AUGUST,25,19,20,10);
        calendario.set(Calendar.YEAR,2020);
        calendario.set(Calendar.MONTH,Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH,20);
        calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.MINUTE,51);
        calendario.set(Calendar.SECOND,10);

        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String fechaconFormato = formato.format(fecha);
        System.out.println("fecha formato = " + fechaconFormato);
    }
}
