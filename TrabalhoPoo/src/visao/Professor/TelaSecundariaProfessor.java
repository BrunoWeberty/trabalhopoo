package visao.Professor;

import controlador.CProfessor;
import java.util.Scanner;

public class TelaSecundariaProfessor 
{
    public void menuProfessor()
    {
        Scanner ler = new Scanner(System.in);
        String opcao = "";
        do
        {
            System.out.println("************************************************************");
            System.out.println("Selecione uma das opções abaixo: ");
            System.out.println("1 - para inserir um professor no sistema.");
            System.out.println("2 - para visualizar todos os professores cadastrados no sistema.");
            System.out.println("3 - para retornar ao menu principal.");
            System.out.println("************************************************************");
            System.out.print("Resposta: ");
            opcao = ler.nextLine();
            CProfessor escolhaOpcao = new CProfessor();
            escolhaOpcao.eventoTelaPrincipal(opcao);
        }while(!opcao.equals("3"));
    }
}
