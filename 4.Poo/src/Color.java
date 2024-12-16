public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUl("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NARANJA("Naranja"),;

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
