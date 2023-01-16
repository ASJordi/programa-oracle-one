package mx.bytebank.test;

public class TestString {
    public static void main(String[] args) {

        String nombre = "World";
        String nombreConReplace =  nombre.replace('D', 'd');
        String nombreMayusculas = nombre.toUpperCase();
        String nombreMinusculas = nombre.toLowerCase();
        String nombreConSubstring = nombre.substring(0, 2);
        String nombreConSubstring2 = nombre.substring(1);
        String nombreConConcat = nombre.concat("!");
        char nombreConCharAt = nombre.charAt(0);
        int nombreConIndexOf = nombre.indexOf("o");

        StringBuilder builder = new StringBuilder("Hola ");
        builder.append("Mundo");
        builder.append("!");

        System.out.println(builder);
    }
}
