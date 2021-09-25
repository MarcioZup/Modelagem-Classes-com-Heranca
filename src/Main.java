public class Main {
    public static void main(String[] args) {

        //Instanciando objeto fornecedor1
        Fornecedor fornecedor1 = new Fornecedor("Armazém Paraíba", "Campina Grande/PB", "83-2244-5566", 50000, 0);

        //Testando os métodos para classe Fornecedor
        System.out.println("O valor atual do crédito é R$ " + fornecedor1.getValorCredito());
        fornecedor1.setValorDivida(51000);
        System.out.println("O valor atual do crédito é R$ " + fornecedor1.obterSaldo());
        fornecedor1.setValorDivida(45000);
        System.out.println("O valor atual do crédito é R$ " + fornecedor1.obterSaldo());
        fornecedor1.setValorCredito((fornecedor1.getValorCredito() + 70000));
        System.out.println("O valor atual do crédito é R$ " + fornecedor1.obterSaldo());

        //Instanciando objeto colaborador1
        Colaborador colaborador1 = new Colaborador("João", "Avenida 1", "11-95874-4522", 101, 3500, 0.275);

        //Testando métodos para classe Colaborador
        System.out.println("O salário bruto do colaborador é R$ " + colaborador1.getSalarioBase());
        colaborador1.calculaSalario();
        System.out.println("O salário líquido do colaborador é R$ " + colaborador1.calculaSalario());

        //Intanciando classe Administrador
        Administrador administrador1 = new Administrador("Rui", "Avenida da Nações", "83-98506-9988", 500, 50000, 0.15, 1000);
        System.out.println("O salário bruto do Administrador é R$ " + administrador1.getSalarioBase());
        administrador1.calculaSalario();
        System.out.println("O salário líquido do Administrador " + administrador1.getNome() + " é R$ " + administrador1.calculaSalario());


    }
}
