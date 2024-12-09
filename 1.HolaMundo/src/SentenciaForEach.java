public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1,3,5,7,9,11,13,14};

        for (int num: numeros) {
            System.out.println(num);
        }

        String[] nombres = {"Juan","Pedro","Maria"};

        for(String nom: nombres ) {
            System.out.println(nom);
        }
    }
}
