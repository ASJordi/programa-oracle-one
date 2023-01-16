package mx.bytebank.modelo;

public class GuardaReferencias {

    Object[] referencias = new Object[10];
    int indice = 0;

    public void adicionar(Object o) {
        referencias[indice] = o;
        indice++;
    }

    public Object obtener(int i) {
        return referencias[i];
    }
}
