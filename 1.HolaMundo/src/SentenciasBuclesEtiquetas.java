public class SentenciasBuclesEtiquetas {
    public static void main(String[] args) {

        Bucle1:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 2) {
                    continue Bucle1;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }
    }
}

