public class ArgumentoLineacomandosCalculadora {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("porfavor ingresar una operacion y dos enteros ");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;
        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplica":
                resultado = a * b;
                break;
            case "divide":
                if(b == 0){
                    System.out.println("no se puede dividir por 0");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;
            default:
                resultado = 0.0;
                break;
        }
        System.out.println("el resultado de la operacion es  = " + resultado);
    }
}
