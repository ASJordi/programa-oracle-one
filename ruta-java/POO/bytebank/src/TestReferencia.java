public class TestReferencia {
    public static void main(String[] args) {
        Cuenta uno = new Cuenta(1);
//        uno.saldo = 200;

        Cuenta dos = uno;
//        dos.saldo = 100;

        System.out.println(uno);
    }
}
