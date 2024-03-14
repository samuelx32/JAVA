
package com.mycompany.atividadecriacaoclasses;

/**
 *
 * @author Samuel Sobreira
 */
public class Conta {
    public String banco;
    public int num_conta, agencia;
    
    Conta(String banco, int num_conta, int agencia){
        this.banco = banco;
        this.num_conta = num_conta;
        this.agencia = agencia;
    }
}
