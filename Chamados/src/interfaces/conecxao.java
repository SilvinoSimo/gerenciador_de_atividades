/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Silvino
 */
public class conecxao {
    
 
   public String cadas(String cont){
 String conteudo = cont;
    try{ 
        
     FileOutputStream arquivo = new FileOutputStream("arquivo.txt");       
            PrintWriter ar = new PrintWriter(arquivo);
            
           
         ar.println(conteudo);
         
            ar.close();
            arquivo.close();
            
             System.out.println("arquivo gravado com sucesso");
            
        }catch(Exception ex){
           System.out.println("Erro ao escrever arquivo"+ ex);
        }
       return cont;
   }
   
   
   
   
   public String ler (){
       String resposta = null;
        try{ 
    
            FileInputStream arquivo = new FileInputStream("arquivo.txt");
           InputStreamReader imput = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(imput);
         String conteudo = null;
          String linha; 
          do{
              linha = br.readLine();
              if (linha != null){
                 conteudo = linha; 
                 resposta = conteudo;
              }
          }while(linha != null);
            
            
            
        }catch(Exception ex){
           System.out.println("Erro ao ler arquivo"+ ex);
        }
      
       return resposta; 
   }
}
