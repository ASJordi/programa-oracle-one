package mx.bytebank.modelo;

public class ControlBonificacion {

    private double sumaBonificaciones;

    public void registrarSalario(Funcionario funcionario){
        this.sumaBonificaciones += funcionario.getBonificacion();
    }

    public double getSumaBonificaciones() {
        return sumaBonificaciones;
    }

}
