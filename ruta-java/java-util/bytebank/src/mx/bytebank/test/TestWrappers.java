package mx.bytebank.test;

public class TestWrappers {
    public static void main(String[] args) {

        Double numeroDouble = 33.0; //autoboxing
        Boolean verdadero = true;

        Double numeroDouble2 = Double.valueOf(33);

        String numeroString = "43";
        Double stringToDouble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);
        Number numero = Integer.valueOf(100);
        double doublePrimitivo = numero.doubleValue(); //unboxing

        Boolean esFalso = Boolean.FALSE;

    }
}
