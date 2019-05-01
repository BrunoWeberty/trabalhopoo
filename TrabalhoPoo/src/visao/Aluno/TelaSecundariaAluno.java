package visao.Aluno;

import controlador.CAluno;
import java.util.Scanner;

public class TelaSecundariaAluno 
{
    public void menuAluno()
    {
        Scanner ler = new Scanner(System.in);
        String opcao = "";
        do
        {
            System.out.println("************************************************************");
            System.out.println("Selecione uma das opções abaixo: ");
            System.out.println("1 - para inserir um aluno no sistema.");
            System.out.println("2 - para visualizar todos os alunos cadastrados no sistema.");
            System.out.println("3 - para retornar ao menu principal.");
            System.out.println("************************************************************");
            System.out.print("Resposta: ");
            opcao = ler.nextLine();
            CAluno escolhaOpcao = new CAluno();
            escolhaOpcao.eventoTelaPrincipal(opcao);
        }while(!opcao.equals("3"));
    }
}
