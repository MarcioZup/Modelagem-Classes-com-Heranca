public class Main {
    public static void main(String[] args) {

        Fornecedor fornecedor1 = new Fornecedor("Armazém Paraíba", "Campina Grande/PB", "83-2244-5566", 50000, 0);

        System.out.println("O valor atual do crédito é R$ " + fornecedor1.getValorCredito());
        fornecedor1.setValorDivida(51000);
        System.out.println("O valor atual do crédito é R$ " + fornecedor1.obterSaldo());
        fornecedor1.setValorDivida(45000);
        System.out.println("O valor atual do crédito é R$ " + fornecedor1.obterSaldo());
        fornecedor1.setValorCredito((fornecedor1.getValorCredito() + 70000));
        System.out.println("O valor atual do crédito é R$ " + fornecedor1.obterSaldo());

    }
}
