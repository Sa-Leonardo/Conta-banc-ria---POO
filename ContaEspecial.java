public class ContaEspecial extends ContaCorrente {
    
    private double bonus;
    
    public ContaEspecial(Cliente titular, String numero) {
        super(titular, numero);
        this.bonus = 0;
    }
    
    @Override
    public void depositar(double valor) {
        super.depositar(valor);
        this.bonus += valor * 0.01;
    }
    
    public void renderBonus() {
        this.depositar(bonus);
        this.bonus = 0;
    }
    
    public double getBonus() {
        return this.bonus;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}