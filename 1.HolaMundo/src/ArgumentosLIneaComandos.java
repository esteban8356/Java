public class ArgumentosLIneaComandos {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Debe introducir el argumento");
            System.exit(-1);

        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos n° " + i + " : " + args[i]);

        }
    }
}
