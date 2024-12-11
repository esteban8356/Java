import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv =System.getenv();
        System.out.println("Variables de ambiente del sistema" + varEnv);

        String Username = System.getenv("USERNAME");
        System.out.println("Username = " + Username);

        String javaHome  = System.getProperty("java.home");
        System.out.println("Java home = " + javaHome);

    }
}