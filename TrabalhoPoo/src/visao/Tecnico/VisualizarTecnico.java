package visao.Tecnico;

import controlador.CTecnico;
import java.util.ArrayList;
import modelo.dominio.Tecnico;

public class VisualizarTecnico
{
    public void visualizarTodosTecnicos()
    {
        CTecnico visualizarTecnicos = new CTecnico();
        ArrayList<Tecnico> todosTecnico = new ArrayList();
        todosTecnico = visualizarTecnicos.visualizarTodosTecnicos();
        
        System.out.println("****************************************************");
        System.out.println("Visualizando todos os tecnicos: ");
        
        for(Tecnico tecnico: todosTecnico)
        {
            System.out.println("Nome: " +tecnico.getNome());
            System.out.println("Data nascimento: " +tecnico.getDataNascimento());
            System.out.println("Função: " +tecnico.getFuncao());
            System.out.println("Departamento: " +tecnico.getDepartamento());
            System.out.println("Matricula: " +tecnico.getMatricula());
            System.out.println("");
        }
    }
}
