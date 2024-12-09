public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) { // ejecuta una instuccion siempre y cuando esta sea verdadera
            System.out.println("i = " + i);
            i++;
        }


        do {
            System.out.println("i = " + i); // ejecuta al menos una vez la instruccion
            i++;
        }while (i < 5);
    }
}
