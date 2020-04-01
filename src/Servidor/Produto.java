
package Servidor;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Produto extends UnicastRemoteObject implements InterfaceProduto{
    
    public String descricao;
    public Double preco;
    public int quantidade;
     
    public Produto() throws RemoteException  {
        System.out.println("A classe produto está disponível remotamente");
    }
    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

  
}
