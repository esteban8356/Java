public class EjemploStringMetodos {
    public static void main(String[] args) {

        String Nombre = "Esteban";
        System.out.println("Nombre.length() = " + Nombre.length());
        System.out.println("Nombre.toUpperCase() = " + Nombre.toUpperCase());
        System.out.println("Nombre.toLowerCase() = " + Nombre.toLowerCase());
        System.out.println("Nombre.equals(\"Esteban\") = " + Nombre.equals("Esteban"));
        System.out.println("Nombre.equals(\"esteban\") = " + Nombre.equals("esteban"));
        System.out.println("Nombre.equalsIgnoreCase(\"esteban\") = " + Nombre.equalsIgnoreCase("esteban"));
        System.out.println("Nombre.compareTo(\"Esteban\") = " + Nombre.compareTo("Esteban"));
        System.out.println("Nombre.charAt(0) = " + Nombre.charAt(0));
        System.out.println("Nombre.charAt(Nombre.length()-1) = " + Nombre.charAt(Nombre.length()-1));
        System.out.println("Nombre.substring(1) = " + Nombre.substring(1));
        System.out.println("Nombre.substring(1) = " + Nombre.substring(2,5));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"x\") = " + trabalenguas.indexOf("x"));
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas  ".trim());
        

    }
}
