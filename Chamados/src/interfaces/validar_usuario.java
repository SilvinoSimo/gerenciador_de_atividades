/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author silvino
 */
public class validar_usuario {
  int retorno;  
   
   
   public int Validar (String login , String Senha){
       
      if (login.equals("1")&& Senha.equals("1")){
          retorno = 1;
            
        }else if (login.equals("Silvino")&& Senha.equals("Silvino88S04J")){
          retorno = 1;
        
        }else{
                retorno = 0;
             }
        
        
        
       
    return retorno;
    
   }
   
       
}
