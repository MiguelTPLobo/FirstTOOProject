public class Enfermeiro extends Pessoa {

    private int coren;
    private double salario;
    private String senhaEnfermeiro;
    
    @Override
    public boolean logar(String senha) {
       boolean result;
       if(senha == this.senhaEnfermeiro){
           result = true;
       }else{
           result = false;
       }
       return result;
    }
    
    public int getCoren(){
        return this.coren;
    }
    
    public void setCoren(int coren){
        this.coren = coren;
    }
    
    public String getSenhaEnfermeiro(){
        return this.senhaEnfermeiro;
    }
    
    public void setSenhaEnfermeiro(String senhaEnfermeiro){
        this.senhaEnfermeiro = senhaEnfermeiro;
    }
}