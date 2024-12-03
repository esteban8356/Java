public class EjemploStringtextRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);

        long Inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {

            // c = c.concat(a).concat(b).concat("\n");
            //c += a + b + "\n";
            sb.append(a).append(b).append("\n");
        }

        long Fim = System.currentTimeMillis();

        // Imprimir resultados según la opción utilizada
        System.out.println("El tiempo en milisegundos que se demoró es: " + (Fim - Inicio));
        System.out.println("Resultado (String.concat o +=): \n" + c);
        System.out.println("Resultado (StringBuilder): \n" + sb.toString());
    }
}
