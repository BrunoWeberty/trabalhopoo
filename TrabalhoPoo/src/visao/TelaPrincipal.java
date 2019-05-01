package visao;

import visao.Terceirizado.TelaSecundariaTerceirizado;
import visao.Tecnico.TelaSecundariaTecnico;
import visao.Professor.TelaSecundariaProfessor;
import visao.Aluno.TelaSecundariaAluno;
import java.util.Scanner;

public class TelaPrincipal 
{
     public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        String opcao = "";
        do
        {
            System.out.println("************************************************************");
            System.out.println("Selecione uma das opções abaixo: ");
            System.out.println("1 - Professor.");
            System.out.println("2 - Aluno.");
            System.out.println("3 - Tecnico.");
            System.out.println("4 - Terceirizado.");
            System.out.println("5 - Fechar programa.");
            System.out.println("************************************************************");
            System.out.print("Resposta: ");
            opcao = ler.nextLine();
        switch(opcao)
        {
            case "1":
                new TelaSecundariaProfessor().menuProfessor();
                break;
            case "2":
                new TelaSecundariaAluno().menuAluno();
                break;
            case "3":
                new TelaSecundariaTecnico().menuTecnico();
                break;
            case "4":
                new TelaSecundariaTerceirizado().menuTerceirizado();
                break;
            case "5":
                System.out.println("Obrigado pela preferência, volte sempre!");
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }
        }while(!opcao.equals("5"));
    }

}
