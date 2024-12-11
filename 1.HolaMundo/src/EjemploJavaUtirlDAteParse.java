import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtirlDAteParse {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fecha= format.parse("2020-01-05");
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
