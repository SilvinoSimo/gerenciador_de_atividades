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
   String conteudo1; 
   String conteudo2;
   String conteudo3;
   conteudo2 = conn.ler2();
    conteudo2 = conteudo2 +" "+ atendente +" "+ solicitante +" "+ descrição+ ";" ; 
   
   
   conteudo1 = conn.ler();
   conteudo1 = conteudo1 +" "+ atendente +" "+ solicitante +" "+ descrição+ ";" ; 
   
   conteudo3 =conn.ler3();
   conteudo3 = conteudo3 +" "+ atendente +" "+ solicitante +" "+ descrição+ ";" ; 
   
   conn.cadas(conteudo1);
   conn.cadas2(conteudo2);
   conn.cadas3(conteudo3);
   
   
   
    
    return conteudo1;
    
    
    
}
   
   
 
   public String  apagarB1 (){
   conecxao conn = new conecxao();
   String conteudo; 
   
   conteudo = null;
   
   
   conn.cadas(conteudo);
 
   
   
   
   
    
    return conteudo;
    
}
   
   
    public String  apagarB3 (){
   conecxao conn = new conecxao();
   String conteudo; 
   
   conteudo = null;
   
   
   conn.cadas3(conteudo);
 
   
   
   
   
    
    return conteudo;
    
    }  
}
