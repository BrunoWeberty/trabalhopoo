package controlador;

import java.util.ArrayList;
import modelo.DAO.DAOTecnico;
import modelo.dominio.Tecnico;
import visao.Tecnico.CadastrarTecnico;
import visao.TelaPrincipal;
import visao.Tecnico.VisualizarTecnico;

public class CTecnico 
{
    
    public void eventoTelaPrincipal(String opcao)
    {
         switch(opcao)
         {
             case "1":
                new CadastrarTecnico().telaCadastro();
                break;
             case "2":
                new VisualizarTecnico().visualizarTodosTecnicos();
                break;
             case "3":
                 new TelaPrincipal();
                 break;
             default:
                System.out.println("Escolha uma opção válida");
         }
    }
    
    public String cadastrarTecnico(Tecnico tecnico)
    {
        DAOTecnico salvarDados = new DAOTecnico();
        
        boolean resultadoMatricula;
        
        try 
        {
            //Aqui usando String funciona
            Integer.parseInt(tecnico.getMatricula()); 
            resultadoMatricula = true;
        } catch (Exception e)
        { 
            resultadoMatricula = false; 
        }
        
        if(tecnico.getNome().equals("") || tecnico.getDepartamento().equals(""))
        {
            return "Nome do tecnico e/ou Departamento em branco. Preencha todos os campos.";
        }else if(tecnico.getFuncao().equals("TAE") || tecnico.getFuncao().equals("TAA"))
        {
            if(resultadoMatricula == false)
            {
                return "Digite somente numeros na matricula!";
            }else if(salvarDados.insereTecnico(tecnico))
            {
                return "Dados salvos com sucesso!";
            }else
            {
                return "Erro ao inserir tecnico! Cadastre novamente.";
            }
            
        }else
        {
            return "Tecnico deve ter como função TAE ou TAA, dado informado inválido!";
        } 
    }
    
    public ArrayList<Tecnico> visualizarTodosTecnicos ()
    {
        DAOTecnico visualizarDados = new DAOTecnico();
        return visualizarDados.selecionarTodosRegistros();//SELECT * FROM TECNICO;
    }
}
