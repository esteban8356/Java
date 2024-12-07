import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String [] usernames = new String [2];
        String [] passwords = new String [2];

        usernames[0] = "admin";
        passwords[0]  = "admin";

        usernames[1] =  "esteban";
        passwords [1] = "admin123";*/

        String [] usernames = {"admin","esteban"};
        String [] passwords = {"admin","admin123"};

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su usuario: ");
        String usuario = entrada.nextLine();

        System.out.println("Ingrese su password: ");
        String contrasena = entrada.nextLine();

        boolean login = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usuario.equals(usernames[i]) && passwords[i].equals(contrasena)){
                login = true;
                break;
            }
        }
        if (login) {
            System.out.println("Login exitosamente");
        }else {
            System.out.println("verifique usuario y contraseña ");
        }

    }
}
