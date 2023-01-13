public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(6000);
        gerente.setTipo(1);
        gerente.setClave("1234");

        System.out.println(gerente.getBonificacion());
    }
}
