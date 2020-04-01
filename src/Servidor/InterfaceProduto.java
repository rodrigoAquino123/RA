
package Servidor;


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author AQUINO
 */
public interface InterfaceProduto extends Remote{
    
    
   public void setDescricao(String descricao) throws RemoteException;

    public void setPreco(Double preco) throws RemoteException; 

    public void setQuantidade(int quantidade) throws RemoteException;
    

    public String getDescricao() throws RemoteException; 

    public Double getPreco() throws RemoteException; 

    public int getQuantidade() throws RemoteException;
    
}
