/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import Persistência.cadastroBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author silvino
 */
public class persistencia {
     private Connection conn;
    private PreparedStatement incluirRegistro;
    

 public persistencia() throws Exception {
       Conexao conecxao = new Conexao();
       conn = conecxao.getConexao(); 
               
        incluirRegistro =  conn.prepareStatement("INSERT INTO atividade (Nome, solicitante, prioridade) VALUES (?,?,?)");  
 }
 
 public void cadastrar(cadastroBeans cadastro ) throws SQLException {
        incluirRegistro.setString (1,cadastro.getNome());
    	incluirRegistro.setString (2,cadastro.getSolicitante());
    	incluirRegistro.setInt (3,cadastro.getPrioridade());
        
 }
}