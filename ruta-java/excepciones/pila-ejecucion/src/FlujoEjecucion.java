public class FlujoEjecucion {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin main");
    }

    public static void metodo1(){
        System.out.println("Inicio metodo1");
        try {
            metodo2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            metodo3();
        } catch (SimpleException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Fin metodo1");
    }

    public static void metodo2(){
        System.out.println("Inicio metodo2");
        //ArithmeticException ae = new ArithmeticException();
        //throw ae;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i);
            throw new MyException("Ocurrió un error en i = " + i);
        }
        System.out.println("Fin metodo2");
    }

    public static void metodo3() throws SimpleException{
        System.out.println("Inicio metodo3");
        throw new SimpleException();
    }

}
