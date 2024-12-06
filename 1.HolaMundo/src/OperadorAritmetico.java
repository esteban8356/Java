public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4;
        int suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j); // concatena pero no suma

        System.out.println("(i + j) = " + (i + j)); // aqui si los suma por que tiene prelacion el parentecis


        int div = i/j;
        //int div2 = (float) i/(float) j;
        System.out.println("div = " + div);
        //System.out.println("div2 = " + div2);



    }
}
