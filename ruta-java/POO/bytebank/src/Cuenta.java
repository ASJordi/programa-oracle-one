class Cuenta{

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    private static int totalCuentas = 0;

    public Cuenta(int agencia){
        if (agencia <= 0) this.agencia = 1;
        else this.agencia = agencia;
        this.totalCuentas++;
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

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
            this.saldo -= valor;
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
