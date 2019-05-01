package visao.Tecnico;

import controlador.CTecnico;
import java.util.Scanner;
import modelo.dominio.Tecnico;

public class CadastrarTecnico 
{
    public void telaCadastro()
    {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Informe o nome do tecnico: ");
        String nomeTecnico = ler.nextLine();
        
        System.out.printf("Informe a data de nascimento do tecnico: ");
        String dataNascimentoTecnico = ler.nextLine();
        
        System.out.println("Informe a função do tecnico: ");
        String funcaoTecnico = ler.nextLine();
        
        System.out.println("Informe o departemento do tecnico: ");
        String departamentoTecnico = ler.nextLine();
        
        System.out.println("Informe a matricula do tecnico: ");
        String matriculaTecnico = ler.nextLine();
        
        Tecnico mTecnico = new Tecnico();
        
        mTecnico.setNome(nomeTecnico);
        mTecnico.setDataNascimento(dataNascimentoTecnico);
        mTecnico.setFuncao(funcaoTecnico);
        mTecnico.setDepartamento(departamentoTecnico);
        mTecnico.setMatricula(matriculaTecnico);
        
        CTecnico cTecnico = new CTecnico();
        
        System.out.println(cTecnico.cadastrarTecnico(mTecnico));
    }
}
