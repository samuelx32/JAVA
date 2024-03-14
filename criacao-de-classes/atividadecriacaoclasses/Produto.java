
package com.mycompany.atividadecriacaoclasses;

/**
 *
 * @author Samuel Sobreira
 */
public class Produto {
    public String nome;
    public int id_pedido, qtn_estoque;
    public double preco;
    
    Produto (int id_pedido, String nome, int qtn_estoque, double preco){
         this.id_pedido = id_pedido;
         this.nome = nome;
         this.qtn_estoque = qtn_estoque;
         this.preco = preco;
    }
}
