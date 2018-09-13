public class Medico extends Pessoa {
    
    private String especialidade;
    private int crm;
    private String senhaMedico;
    private Double salario;

    
    @Override
    public boolean logar(String senha) {
        boolean result;
        if(this.senhaMedico == senha){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    public String getEspecialidade(){
        return this.especialidade;
    }
    
    public void setEspecialidade(String especialidade){
        if(this.especialidade != " "){
            this.especialidade = especialidade;
        }
    }
    
    //o método esta como string sendo que o atributo é int
    public int getCrm(){
        return this.crm;
    }
    
    public void setCrm(int crm){
        this.crm = crm;
    }
    
    public String getSenhaMedico(){
        return this.senhaMedico;
    }
    
    public void setSenhaMedico(String medico){
        this.senhaMedico = medico;
    }
    
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
}

