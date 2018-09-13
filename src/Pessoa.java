


public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    
    
    //Get Nome
    public String getNome(){
        return this.nome;
    }
     //Set Nome
    public void setNome(String nome) {
        if (nome != " ") {
            this.nome = nome;
        }
    }
    
    //Get Sobrenome
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    //Set Sobrenome
    public void setSobrenome(String sobrenome){
        if(sobrenome != " "){
            this.sobrenome = sobrenome;
        }
    }
    
    //Get CPF
    public String getCpf(){
        return this.cpf;
    }
    
    //Set CPF
    public void setCpf(String cpf){
        if(this.cpf != " "){
            this.cpf = cpf;
        }
    }
    
    //Get RG
    public String getRg(){
        return this.rg;
    }
    
    //Set RG
    public void setRg(String rg){
        if(this.rg != " "){
            this.rg = rg; 
        }
    } 
    
    //método abstract de senha
    public abstract boolean logar(String senha);
}
