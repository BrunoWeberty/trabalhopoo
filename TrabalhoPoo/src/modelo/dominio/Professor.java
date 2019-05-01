package modelo.dominio;

public class Professor 
{
    private String nome;
    private String dataNascimento;
    private String disciplina;
    private String matricula;

    public Professor() {}

    public Professor(String nome, String dataNascimento, String disciplina, String matricula) 
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.disciplina = disciplina;
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

    public void setDisciplina(String disciplina)
    {
        this.disciplina = disciplina;
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

    public String getDisciplina()
    {
        return disciplina;
    }

    public String getMatricula()
    {
        return matricula;
    }

    @Override
    public String toString() 
    {
        return "nome=" + nome + ", dataNascimento=" + dataNascimento + ", disciplinaResponsavel=" 
                + disciplina + ", matricula=" + matricula + '}';
    }
    
    
    
    
}
