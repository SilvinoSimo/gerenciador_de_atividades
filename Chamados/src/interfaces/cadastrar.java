/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Silvino
 */
public class cadastrar {
   public String  cadastrar (String atendente, String solicitante, String descrição){
   conecxao conn = new conecxao();
   String conteudo; 
   
   conteudo = conn.ler();
   conteudo = conteudo +" "+ atendente +" "+ solicitante +" "+ descrição+ ";" ; 
   
   conn.cadas(conteudo);
   
   
   
   
    
    return conteudo;
    
    
    
}
    
}
