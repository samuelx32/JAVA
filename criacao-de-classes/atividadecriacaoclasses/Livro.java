
package com.mycompany.atividadecriacaoclasses;

/**
 *
 * @author Samuel Sobreira
 */
public class Livro {
    public String nome, autor,editora;
    public int id_livro, pags;
    public double preco;
    
    Livro (int id_livro, String nome, String autor, String editora, int pags, double preco){
        this.id_livro = id_livro;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.pags = pags;
        this.preco = preco;
    }
}
