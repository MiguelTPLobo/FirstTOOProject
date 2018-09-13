public class Paciente extends Pessoa {
    private int codPaciente;
    private String senhaPaciente;

    @Override
    public boolean logar(String senha) {
        boolean result;
        if(senha == this.senhaPaciente){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    //Get CodPaciente
    public int getCodPaciente(){
        return this.codPaciente;
    }
    
    //Set CodPaciente
    public void setCodPaciente(int codPaciente){
        if(this.codPaciente != 0){
            this.codPaciente = codPaciente;
        }
    }
    
    //Get SenhaPaciente
    public String getSenhaPaciente(){
        return this.senhaPaciente;
    }
    
    //Set SenhaPaciente
    public void setSenhaPaciente(String senhaPaciente){
        if(this.senhaPaciente != null){
            this.senhaPaciente = senhaPaciente;
        }
    }
    
}
