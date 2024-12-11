import java.text.SimpleDateFormat;
import java.util.Date;

public class ejemploJavaUtilDate {
    public static void main(String[] args) {
        
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE-dd-MMMM-yyyy");
        String fechastr=df.format(fecha);

        System.out.println("fechastr = " + fechastr);

        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j +=i;
        }
        System.out.println("j = " + j);
        Date fecha2 = new Date();
        long tiempofinal= fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo trascurrido en el for  = " + tiempofinal);




    }
}
