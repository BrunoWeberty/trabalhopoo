package modelo.dominio;

public class Tecnico 
{
    private String nome;
    private String dataNascimento;
    private String funcao;
    private String departamento;
    private String matricula;

    public Tecnico() {}

    public Tecnico(String nome, String dataNascimento, String funcao, String departamento, String matricula) 
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.funcao = funcao;
        this.departamento = departamento;
        this.matricula = matricula;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) 
    {
        this.dataNascimento = dataNascimento;
    }

    public void setFuncao(String funcao)
    {
        this.funcao = funcao;
    }

    public void setDepartamento(String departamento) 
    {
        this.departamento = departamento;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getDataNascimento() 
    {
        return dataNascimento;
    }

    public String getFuncao() 
    {
        return funcao;
    }

    public String getDepartamento() 
    {
        return departamento;
    }

    public String getMatricula() 
    {
        return matricula;
    }

    @Override
    public String toString() 
    {
        return "nome=" + nome + ", dataNascimento=" + dataNascimento + ", funcao=" + funcao 
                + ", departamento=" + departamento + ", matricula=" + matricula + '}';
    }
    
    
    
    
}
