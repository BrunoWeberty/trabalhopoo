package visao.Terceirizado;

import controlador.CTerceirizado;
import java.util.Scanner;

public class TelaSecundariaTerceirizado 
{
    public void menuTerceirizado()
    {
        Scanner ler = new Scanner(System.in);
        String opcao = "";
        do
        {
            System.out.println("************************************************************");
            System.out.println("Selecione uma das opções abaixo: ");
            System.out.println("1 - para inserir um terceirizado no sistema.");
            System.out.println("2 - para visualizar todos os terceirizados cadastrados no sistema.");
            System.out.println("3 - para retornar ao menu principal.");
            System.out.println("************************************************************");
            System.out.print("Resposta: ");
            opcao = ler.nextLine();
            CTerceirizado escolhaOpcao = new CTerceirizado();
            escolhaOpcao.eventoTelaPrincipal(opcao);
        }while(!opcao.equals("3"));
    }
}
