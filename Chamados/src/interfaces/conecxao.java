/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author silvino
 */
public class conecxao {
    public String retorno(){
        String linha = new String();
        String conteudo = null;
        permanencia Permanencia = new permanencia();
        
        File arquivo = new File("/home/silvino/desktop/teste_git/software_gerenciamento_atividades/Chamados/banco.txt");
        try{
            FileReader leitor = new FileReader(arquivo);
            BufferedReader buferedarquivo = new BufferedReader(leitor);   
            
            while(true){
                linha = buferedarquivo.readLine();
                if(linha == null ){
                    break;
                }
                
            }
            
         conteudo =   Permanencia.back_up(linha);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "erro ao ler o arquivo");
        }
        return conteudo + "oi" ;
    }
    
}
