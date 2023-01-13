public class SistemaInterno {

    private String clave = "1234";

    public boolean autenticar(Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Login fallido");
            return false;
        }
    }

}
