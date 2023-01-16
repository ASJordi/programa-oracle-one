package mx.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestInteger {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int numero = 10;
        Integer numeroObjeto = Integer.valueOf(10);

        List<Integer> listaNumeros = new ArrayList();
        listaNumeros.add(numero);

        int numeroPrimitivo = numeroObjeto.intValue();

        byte byteInteger = numeroObjeto.byteValue();
        double doubleInteger = numeroObjeto.doubleValue();
        float floatInteger = numeroObjeto.floatValue();
        long longInteger = numeroObjeto.longValue();
        short shortInteger = numeroObjeto.shortValue();

        System.out.println(Integer.BYTES);
    }
}
