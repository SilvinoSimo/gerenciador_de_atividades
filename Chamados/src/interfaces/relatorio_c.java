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
public class relatorio_c {
    
    public String Relatorio(String gerente, String perildo){
        String retorno ; 
        String lista;
        mostrar most = new mostrar();
       lista = most.mostrar_lista();
        
       retorno = gerente + "\n"+ perildo + "      gostaria que fosem abertos os seguintes chamados para mim,"+"\n"+" os mesmos já foram atendidos entretanto os usuários Não abriram chamado como solicitado "+"\n"+lista+"\n"+"\n"+"obrigado!";



return retorno;
    }
    
     public String Relatorio_full(){
        String retorno ; 
        String lista;
        mostrar most = new mostrar();
       lista = most.mostrar_lista_full();
        
       retorno = lista;



return retorno;
    }
    
    
    
}
