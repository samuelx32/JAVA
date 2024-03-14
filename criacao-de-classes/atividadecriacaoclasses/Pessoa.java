
package com.mycompany.atividadecriacaoclasses;

/**
 *
 * @author Samuel Sobreira
 */
public class Pessoa {
    public String nome,cpf;
    public int id_pessoa, idade;
    
    Pessoa (int id_pessoa, String nome, int idade, String cpf){
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
}
