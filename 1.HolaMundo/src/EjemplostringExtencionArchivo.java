public class EjemplostringExtencionArchivo {
    public static void main(String[] args) {

        //este codigo ayuda a identificar la extencion de un archivo

        String archivo ="alguna.Imagen.pdf";
        System.out.println("archivo.length() = " + archivo.length());
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.name = " + archivo.substring(i+1));
    }
}
