package controlador;

import java.util.ArrayList;
import modelo.DAO.DAOProfessor;
import modelo.dominio.Professor;
import visao.Professor.CadastrarProfessor;
import visao.TelaPrincipal;
import visao.Professor.VisualizarProfessor;

public class CProfessor
{
    public void eventoTelaPrincipal(String opcao)
    {
        switch(opcao)
        {
            case "1":
                new CadastrarProfessor().telaCadastro();
                break;
            case "2":
                new VisualizarProfessor().visualizarTodosProfessores();
                break;
            case "3":
                new TelaPrincipal();
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }
    }
    
    public String cadastrarProfessor(Professor professor)
    {
        DAOProfessor salvarDados = new DAOProfessor();
        
        boolean resultadoMatricula;
        
        try 
        {
            //Aqui usando String funciona
            Integer.parseInt(professor.getMatricula()); 
            resultadoMatricula = true;
        } catch (Exception e) 
        { 
            resultadoMatricula = false; 
        }
        
        if((professor.getNome().equals("")) || professor.getMatricula().equals(""))
        {
            return "Nome do professor e/ou Matricula em branco. Preencha todos os campos.";
        }else if(resultadoMatricula == true)
        {
            if(salvarDados.insereProfessor(professor))
            {
                return "Dados salvos com sucesso!";
            } else
            {
                return "Erro ao inserir professor! Cadastre novamente.";
            }
            
        }else
        {
            return "Digite somente numeros na matricula!";
        }
      
    }
    
    public ArrayList<Professor> visualizarTodosProfessores ()
    {
        DAOProfessor visualizarDados = new DAOProfessor();
        return visualizarDados.selecionarTodosRegistros();//SELECT * FROM PROFESSOR;
    }
}
