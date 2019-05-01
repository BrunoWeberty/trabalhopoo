package visao.Terceirizado;

import controlador.CTerceirizado;
import java.util.ArrayList;
import modelo.dominio.Terceirizado;

public class VisualizarTerceirizado 
{
    public void visualizarTodosTerceirizados()
    {
        CTerceirizado visualizarTerceirizado = new CTerceirizado();
        ArrayList<Terceirizado> todosTerceirizado = new ArrayList();
        todosTerceirizado = visualizarTerceirizado.visualizarTodosTerceirizados();
        
        System.out.println("****************************************************");
        System.out.println("Visualizando todos os terceirizados: ");
        
        for(Terceirizado terceirizado: todosTerceirizado)
        {
            System.out.println("Nome: "+terceirizado.getNome());
            System.out.println("Atividade:  "+terceirizado.getAtividade());
            System.out.println("Empresa responsavel: " +terceirizado.getEmpresa());
            System.out.println("Ativo: " +terceirizado.getAtivo());
            System.out.println("");
        }
    }
}
