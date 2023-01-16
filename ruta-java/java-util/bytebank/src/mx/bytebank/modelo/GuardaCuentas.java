package mx.bytebank.modelo;

public class GuardaCuentas {

    Cuenta[] cuenta = new Cuenta[10];
    int indice = 0;

    public void adicionar(Cuenta cc) {
        cuenta[indice] = cc;
        indice++;
    }

    public Cuenta obtener(int i) {
        return cuenta[i];
    }
}
