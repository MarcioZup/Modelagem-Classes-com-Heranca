public class Administrador extends Colaborador {

    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calculaSalario() {
        double salarioAdministrador = super.calculaSalario() + ajudaDeCusto;
        return salarioAdministrador;
    }
}
