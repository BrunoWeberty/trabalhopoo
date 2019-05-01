package modelo.DAO;

import modelo.dominio.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.DAO.FabricaConexao;


public class DAOAluno 
{
    
     //Classe responsável pela conexão (sessão) com um banco de dados específico. 
    //As instruções SQL são executadas e os resultados são retornados dentro do contexto de uma conexão.
     private Connection con;
     
    //Pre-compila a query para o banco de dados
    // Cria um objeto PreparedStatement para enviar instruções SQL parametrizadas para o banco de dados.
    //Uma instrução SQL com ou sem parâmetros IN pode ser pré-compilada e armazenada em um objeto PreparedStatement.
    //Esse objeto pode ser usado para executar essa instrução de forma eficiente várias vezes. 
    private PreparedStatement comando;
    
    private final FabricaConexao fCobexao = FabricaConexao.getInstancia();
    
    // Método acessado internamente para conectar com o banco
    private void conectar()
    {
        con = fCobexao.conexao();
    }
    
    //Método que fecha a conexão com o banco
    private void fechar(){
        try{
            comando.close();
            con.close();
        }catch(SQLException e){
            System.err.println("Erro ao fechar conexão\n"+e.getMessage());
        }
    }
    
    public boolean insereAluno(Aluno aluno)
    {
        
        conectar();
        String sql = "INSERT INTO ALUNO(NOME, DATANASCIMENTO, CURSO, RA) "
                + "VALUES(?,?,?,?)";//4? Paramentros no INSERT INTO - + É QUEBRA DE LINHA
        try
        {
            comando = con.prepareStatement(sql);//Utiliza a conexao, objeto conection enviando valor pro objeto prepareStatement
            comando.setString(1, aluno.getNome());//1 = primeiro ponto de interrogação | se é String usa VARCHAR no banco de dados
            comando.setString(2, aluno.getDataNascimento());//settando string atravez do setString
            comando.setString(3, aluno.getCurso());
            comando.setString(4, aluno.getRa());//4 = quarto ponto de interrogação
           
            comando.execute();//Executa linha 55 a 59 no banco de dados
            
            return true;
        }
        catch(SQLException e)
        {
            System.err.println("Erro ao inserir Aluno\n"+e.getMessage());
        }
        finally
        {
            fechar();//Fecha conexão e as querys
        }
        return false;
    }
    
    public  ArrayList<Aluno> selecionarTodosRegistros()
    {
        conectar();//Conecta dinovo banco de dados
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;//Array list dos dados vindo do banco
        String sql = "SELECT * FROM ALUNO";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Aluno> listaAlunos = new ArrayList();
        try
        {
            comando = con.prepareStatement(sql);//Compilando sql SELECT
            rs = comando.executeQuery();//Quando faz select no banco para resgatar dados do banco de dados | do jeito que vem do banco joga no ResultSet
            while(rs.next())//Enquanto tiver um proxima posição no resultSet eu rodo esse while | Tem algum dado continua rodando
            {//Cada vez que roda é criado um objeto novo
                Aluno aluno = new Aluno();//Cria objeto para guarda informaçoes vindo do banco de dados
                aluno.setNome(rs.getString("NOME"));//Get equivalente ao tipo no banco de dados aplicação covalente
                aluno.setDataNascimento(rs.getString("DATANASCIMENTO"));//String em amarelo nome da coluna no banco de dados
                aluno.setCurso(rs.getString("CURSO"));
                aluno.setRa(rs.getString("RA"));
                listaAlunos.add(aluno);
            }
            return listaAlunos;
        }
        catch(SQLException e)
        {
            System.err.println("Erro visualizar Alunos\n"+e.getMessage());
            return null;
        }
        finally
        {
            fechar();//Fecha conexão e o PrepareStatemente
        }
    }
    
    

}
