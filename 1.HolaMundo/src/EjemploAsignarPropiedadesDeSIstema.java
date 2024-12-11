import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSIstema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "mi valor guardado en el objeto properties");

            for (String key : p.stringPropertyNames()) {
                System.setProperty(key, p.getProperty(key));
            }

            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.out.println("No existe el archivo = " + e);
        }
    }
}
