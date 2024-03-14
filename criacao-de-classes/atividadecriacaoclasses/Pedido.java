
package com.mycompany.atividadecriacaoclasses;

/**
 *
 * @author Samuel Sobreira
 */
public class Pedido {
    public int id_produto,quantidade;
    public String forma_pagamento;
    
    Pedido (int id_produto, int quantidade, String forma_pagamento){
        this.id_produto = id_produto;
        this.quantidade = quantidade;
        this.forma_pagamento = forma_pagamento;
    }
}
