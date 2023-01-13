public class TestCuentaExceptionChecked {

    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        try {
            c.deposita();
        } catch (SimpleException e) {
            e.printStackTrace();
        }
    }

}
