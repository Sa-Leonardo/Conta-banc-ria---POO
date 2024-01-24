public class ContaPoupança extends Conta {
    public ContaPoupança(Cliente titular, String numero) {
        super(titular, numero);
    }
    public void renderJuros(double taxa) {
        double juros = this.getSaldo() * taxa;
        this.depositar(juros);
    }
}