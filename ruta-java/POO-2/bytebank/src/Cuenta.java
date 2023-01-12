public abstract class Cuenta{

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int totalCuentas = 0;

    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.totalCuentas++;
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }

    public abstract void depositar(double valor);

    public boolean retirar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta destino){
        if(this.saldo >= valor){
            this.retirar(valor);
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
