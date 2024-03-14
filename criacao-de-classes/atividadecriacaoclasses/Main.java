
package com.mycompany.atividadecriacaoclasses;

/**
 *
 * @author Samuel Sobreira
 */
public class Main {
    Lampada lamp = new Lampada("Apagada");
    
    Conta cont = new Conta("399 - Banco X",736476,0002);
    
    Livro liv = new Livro (5,"Frankestein","Mary Shelley","Darksied",349,40.34);
    
    Pessoa pes = new Pessoa (3,"Joao", 27, "89889889833");
    
    Emprestimo emp = new Emprestimo(3,5,8);
    
    Produto pro = new Produto (4,"Sapatenis",34,67.87);
    
    Pedido ped = new Pedido (4,2,"Papel Moeda");
}
