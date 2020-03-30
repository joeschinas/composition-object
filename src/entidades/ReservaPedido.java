/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;


public class ReservaPedido {
   
    private Integer quantidade;
    private Double preco;
    private Produtos produto;
    
  

    public ReservaPedido() {
    }

    public ReservaPedido(Integer quantidade, Double preco, Produtos produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }
    
    public ReservaPedido(Integer quantidade, Double preco) {
     
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }
    
    public void setPreco(Double preco) {
        this.preco = preco;
    }


    public double subTotal(){
    
    return quantidade * preco;
    
    }
}
