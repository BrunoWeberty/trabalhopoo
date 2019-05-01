package modelo.dominio;

public class Terceirizado 
{
    private String nome;
    private String atividade;
    private String empresa;
    private String ativo;

    public Terceirizado() {}

    public Terceirizado(String nome, String atividade, String empresa, String ativo)
    {
        this.nome = nome;
        this.atividade = atividade;
        this.empresa = empresa;
        this.ativo = ativo;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setAtividade(String atividade) 
    {
        this.atividade = atividade;
    }

    public void setEmpresa(String empresa) 
    {
        this.empresa = empresa;
    }

    public void setAtivo(String ativo)
    {
        this.ativo = ativo;
    }

    public String getNome()
    {
        return nome;
    }

    public String getAtividade()
    {
        return atividade;
    }

    public String getEmpresa()
    {
        return empresa;
    }

    public String getAtivo() 
    {
        return ativo;
    }

    @Override
    public String toString() 
    {
        return "nome=" + nome + ", atividade=" + atividade + ", empresaResponsavel=" + empresa 
                + ", ativo=" + ativo + '}';
    }
    
    
    
    
}
