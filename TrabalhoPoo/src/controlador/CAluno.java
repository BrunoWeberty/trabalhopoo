package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.dominio.Aluno;
import modelo.DAO.DAOAluno;
import visao.Aluno.CadastrarAluno;
import visao.TelaPrincipal;
import visao.Aluno.VisualizarAluno;

public class CAluno 
{
    
    public void eventoTelaPrincipal(String opcao)
    {
        switch(opcao)
        {
            case "1":
                new CadastrarAluno().telaCadastro();
                break;
            case "2":
                new VisualizarAluno().visualizarTodosAlunos();
                break;
            case "3":
                new TelaPrincipal();    
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }
        
    }
    
    public String cadastrarAluno (Aluno aluno)
    {
        DAOAluno salvarDados = new DAOAluno();
        if(aluno.getNome().equals("") || aluno.getRa().equals(""))
        {
            return "Nome do aluno e/ou RA em branco. Preencha todos os campos.";
        }
        else if(salvarDados.insereAluno(aluno))
        {
            return "Dados salvos com sucesso!";
        }
        else
        {
            return "Erro ao inserir aluno! Cadastre novamente.";
        }
    }
    
    public ArrayList<Aluno> visualizarTodosAlunos ()
    {
        DAOAluno visualizarDados = new DAOAluno();
        return visualizarDados.selecionarTodosRegistros();//SELECT * FROM aluno;
    }
    

}
