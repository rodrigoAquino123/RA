
package Cliente;

import Servidor.InterfaceProduto;
import java.rmi.Naming;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;


public class IniciarCliente {
    
    public static void main(String[] args){
        try{
            InterfaceProduto produtoRemoto = (InterfaceProduto) Naming.lookup("rmi://localhost:1099/Produto");
            
            String valor_descricao = JOptionPane.showInputDialog(null, "Qual a descrição do produto?", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);   
            String valor_preco = JOptionPane.showInputDialog(null, "Qual o preço do produto?", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);   
            String valor_quantidade = JOptionPane.showInputDialog(null, "Qual a quantidade no estoque?", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
            
            String descricao = valor_descricao;
            double preco = Double.parseDouble(valor_preco);
            int quantidade = Integer.parseInt(valor_quantidade);
            
            String ///////////
            produtoRemoto.setDescricao(descricao);
            produtoRemoto.setPreco(preco);
            produtoRemoto.setQuantidade(quantidade);
            
            
            
            
            
            JOptionPane.sho

        }
        catch(RemoteException re){
            JOptionPane.showMessageDialog(null, "Erro remoto: " + re.toString(), "Erro remoto", JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro local: " + e.toString(), "Erro local", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
        
        
    }
    
}
