public abstract class Conta {
    private String numero;
    private Cliente titular;
    private double saldo;
    
    public Conta(Cliente titular, String numero) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public Cliente getTitular(){
        return this.titular;
    }
    
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String toString() {
        return String.format("Número: %s\nTitular: %s\nSaldo: %.2f", 
                            this.numero,
                            this.titular.getCpf() + " - " + this.titular.getNome(),
                            this.saldo);
    }
}