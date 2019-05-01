package visao.Tecnico;

import controlador.CTecnico;
import java.util.Scanner;

public class TelaSecundariaTecnico
{
    public void menuTecnico()
    {
        Scanner ler = new Scanner(System.in);
        String opcao = "";
        do
        {
            System.out.println("************************************************************");
            System.out.println("Selecione uma das opções abaixo: ");
            System.out.println("1 - para inserir um tecnico no sistema.");
            System.out.println("2 - para visualizar todos os tecnicos cadastrados no sistema.");
            System.out.println("3 - para retornar ao menu principal.");
            System.out.println("************************************************************");
            System.out.print("Resposta: ");
            opcao = ler.nextLine();
            CTecnico escolhaOpcao = new CTecnico();
            escolhaOpcao.eventoTelaPrincipal(opcao);
        }while(!opcao.equals("3"));
    }
    
}
