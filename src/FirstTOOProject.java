
import javax.swing.JOptionPane;


public class FirstTOOProject {


    public static void main(String[] args) {
        
        //Instanciando Objetos
        Enfermeiro e = new Enfermeiro();
        Medico m = new Medico();
        Paciente p = new Paciente();
        
        //Setando Enfermeiro
        e.setNome("João");
        e.setSobrenome("Doria");
        e.setRg("12.256.478-9");
        e.setCpf("501212879-42");
        e.setCoren(1);
        e.setSenhaEnfermeiro("Berzeck1235");
        
        //Setando Medico
        m.setNome("Leandro");
        m.setSobrenome("Camargo");
        m.setRg("15.684.934-5");
        m.setCpf("146969278-04");
        m.setCrm(2);
        m.setEspecialidade("Pediatra");
        m.setSalario(5400.00);
        m.setSenhaMedico("TheGoodDoctor");
        
        //Setando Paciente
        p.setNome("Noname");
        p.setSobrenome("Ittoshura");
        p.setRg("154545896-68");
        p.setCpf("12.123.123-7");
        p.setCodPaciente(5);
        p.setSenhaPaciente("Senha1235");
        
        JOptionPane.showMessageDialog(null,"Medico:\nNome: "+m.getNome()+" "+m.getSobrenome()+"\nRG: "+m.getRg()+"\nCPF: "+m.getCpf()+"\nCRM: "+m.getCrm()+"\nEspecialidade: "+m.getEspecialidade()+"\nSenha: "+m.getSenhaMedico()+"\nSalario: "+m.getSalario());
        JOptionPane.showMessageDialog(null,"Enfermeiro\nNome: "+e.getNome()+" "+e.getSobrenome()+"\nRG: "+e.getRg()+"\nCPF: "+e.getCpf()+"\nCoren: "+e.getCoren()+"\nSenha:"+e.getSenhaEnfermeiro());
        JOptionPane.showMessageDialog(null,"Paciente:\nNome: "+p.getNome()+" "+p.getSobrenome()+"\nRG: "+p.getRg()+"\nCPF: "+p.getCpf()+"\nCodigo do Paciente: "+p.getCodPaciente()+"\nSenha"+p.getSenhaPaciente());
    }
    
}
