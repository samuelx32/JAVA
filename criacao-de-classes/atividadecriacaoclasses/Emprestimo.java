
package com.mycompany.atividadecriacaoclasses;

/**
 *
 * @author Samuel Sobreira
 */
public class Emprestimo {
    public int id_pessoa, id_livro,dias;
    
    Emprestimo(int id_pessoa, int id_livro, int dias){
        this.id_pessoa = id_pessoa;
        this.id_livro = id_livro;
        this.dias = dias;
    }
}
