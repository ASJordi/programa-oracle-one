package mx.bytebank.modelo;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(){
        super();
    }

    public SaldoInsuficienteException(String msg){
        super(msg);
    }

}
