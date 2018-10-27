
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Conexao {
    
    private Connection conexao;
    
    public Conexao(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexao = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=locadora_zorzo", "0123", "0123");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro naconecxao com o banco de dados"+ " "+ ex.getMessage());
        }
    }
    
    public Connection getConexao(){
        return conexao;
    }
    
}
