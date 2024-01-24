public class Cliente {
    
    private String cpf;
    private String nome;
    private int sexo;
    private String telefone;
    
    public Cliente(String cpf, String nome, int sexo, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getSexo(){
        return this.sexo;
    }
    
    public void setSexo(int sexo){
        this.sexo = sexo;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String toString() {
        return nome;
    }
}