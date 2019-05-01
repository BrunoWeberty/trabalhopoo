package visao.Terceirizado;

import controlador.CTerceirizado;
import java.util.Scanner;
import modelo.dominio.Terceirizado;

public class CadastrarTerceirizado
{
    public void telaCadastro()
    {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o nome do terceirizado: ");
        String nomeTerceirizado = ler.nextLine();
        
        System.out.println("Informe a atividade do terceirizado: ");
        String atividadeTerceirizado = ler.nextLine();
        
        System.out.println("Informe a empresa responsável pelo terceirizado: ");
        String empresaTerceirizado = ler.nextLine();
        
        System.out.println("Informe se o terceirizado está ativo ou não: ");
        String ativoTerceirizado = ler.nextLine();
        
        Terceirizado mTerceirizado = new Terceirizado();
        
        mTerceirizado.setNome(nomeTerceirizado);
        mTerceirizado.setAtividade(atividadeTerceirizado);
        mTerceirizado.setEmpresa(empresaTerceirizado);
        mTerceirizado.setAtivo(ativoTerceirizado);
        
        CTerceirizado cTerceirizado = new CTerceirizado();
        
        System.out.println(cTerceirizado.cadastrarTerceirizado(mTerceirizado));
    }
}
