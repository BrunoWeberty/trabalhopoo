package controlador;

import java.util.ArrayList;
import modelo.DAO.DAOTerceirizado;
import modelo.dominio.Terceirizado;
import visao.Terceirizado.CadastrarTerceirizado;
import visao.TelaPrincipal;
import visao.Terceirizado.VisualizarTerceirizado;

public class CTerceirizado 
{
    public void eventoTelaPrincipal(String opcao)
    {
        switch(opcao)
        {
            case "1":
                new CadastrarTerceirizado().telaCadastro();
                break;
            case "2":
                new VisualizarTerceirizado().visualizarTodosTerceirizados();
                break;
            case "3":
                new TelaPrincipal();
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }
    }
    
    public String cadastrarTerceirizado(Terceirizado terceirizado)
    {
        
        DAOTerceirizado salvarDados = new DAOTerceirizado();
        
        if(terceirizado.getNome().equals(""))
        {
            return "Nome do terceirizado em branco. Preencha todos os campos.";
        } else if(terceirizado.getAtivo().equalsIgnoreCase("SIM") || terceirizado.getAtivo().equalsIgnoreCase("NAO"))
        {
            if(salvarDados.insereTerceirizado(terceirizado))
            {
                return "Dados salvos com sucesso!";
            } else
            {
                return "Erro ao inserir terceirizado! Cadastre novamente.";
            }
            
        }else
        {
            return "Terceirizado deve ter como informação em Ativo SIM ou NÃO, dados informado inválido!";
        }
    }
    
    public ArrayList<Terceirizado> visualizarTodosTerceirizados ()
    {
        DAOTerceirizado visualizarDados = new DAOTerceirizado();
        return visualizarDados.selecionarTodosRegistros();//SELECT * FROM TERCEIRIZADO;
    }
}
