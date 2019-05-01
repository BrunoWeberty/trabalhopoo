package visao.Professor;

import controlador.CProfessor;
import java.util.ArrayList;
import modelo.dominio.Professor;

public class VisualizarProfessor 
{
    public void visualizarTodosProfessores()
    {
        CProfessor visualizarProfessores = new CProfessor();
        ArrayList<Professor> todosProfessor = new ArrayList();
        todosProfessor = visualizarProfessores.visualizarTodosProfessores();
        
        System.out.println("****************************************************");
        System.out.println("Visualizando todos os professores: ");
        
        for(Professor professor: todosProfessor)
        {
            System.out.println("Nome: "+professor.getNome());
            System.out.println("Data Nascimento: "+professor.getDataNascimento());
            System.out.println("Curso: "+professor.getDisciplina());
            System.out.println("RA: "+professor.getMatricula());
            System.out.println("");
        }
        
    }
}
