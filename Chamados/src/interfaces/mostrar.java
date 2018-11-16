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
public class mostrar {
    
      public String  mostrar (){
          conecxao conn = new conecxao();
         String retorno; 
        
         retorno = conn.ler();

    return retorno; 
    
}
      
      public String mostrar_lista(){
           conecxao conn = new conecxao();
           String lista;
         String retorno; 
        
         retorno = conn.ler();
lista = retorno.replace(";", "\n");
    return lista; 
    
    
      }    
  
    public String mostrar_lista_full(){
           conecxao conn = new conecxao();
           String lista;
         String retorno; 
        
         retorno = conn.ler2();
lista = retorno.replace(";", "\n");
    return lista; 
    
    
      }    
   
      public String mostrar_lista_Pessoal(){
           conecxao conn = new conecxao();
           String lista;
         String retorno; 
        
         retorno = conn.ler3();
lista = retorno.replace(";", "\n");
    return lista; 
    
    
      }    
    
}
