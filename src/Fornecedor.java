public class Fornecedor extends Pessoa {

    double valorCredito;
    double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        double saldoCreditoDivida = valorCredito - valorDivida;
        return saldoCreditoDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        if (valorDivida > obterSaldo()){
            System.out.println("Valor da dívida maior que o saldo dísponível. Solicite um novo crédito.");
        }else {
            this.valorDivida = valorDivida;
        }
    }

}
