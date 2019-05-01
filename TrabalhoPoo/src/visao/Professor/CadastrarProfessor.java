package visao.Professor;

import controlador.CProfessor;
import java.util.Scanner;
import modelo.dominio.Professor;

public class CadastrarProfessor 
{
    public void telaCadastro()
    {
        Scanner ler = new Scanner(System.in);
    
        System.out.printf("Informe o nome do professor: ");
        String nomeProfessor = ler.nextLine();
        
        System.out.printf("Informe a data de nascimento do professor: ");
        String dataNascimentoProfessor = ler.nextLine();
        
        System.out.println("Informe a disciplina que o professor é responsavel: ");
        String disciplinaProfessor = ler.nextLine();
        
        System.out.println("Informe a matricula do professor: ");
        String matriculaProfessor = ler.nextLine();
        
        Professor mProfessor = new Professor();
        
        mProfessor.setNome(nomeProfessor);
        mProfessor.setDataNascimento(dataNascimentoProfessor);
        mProfessor.setDisciplina(disciplinaProfessor);
        mProfessor.setMatricula(matriculaProfessor);
        
        CProfessor cProfessor = new CProfessor();
        
        System.out.println(cProfessor.cadastrarProfessor(mProfessor));
        
    }
}
