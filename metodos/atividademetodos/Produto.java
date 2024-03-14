
package atividademetodos;

/**
 *
 * @author Samuel Sobreira
 */
public class Produto {
    public String nome;
    public int quantidade;
    public double preco;
    
    Produto (String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    double calcDesc (double preco, int quantidade){
        
        if(quantidade < 11){
            return preco;
        }else if(quantidade > 10 && quantidade < 21){
            return preco - (preco * 0.1);
        }else if(quantidade > 21 && quantidade < 50){
            return preco - (preco * 0.2);
        }else if(quantidade > 51){
            return preco - (preco * 0.25);
        }else{
            return preco;
        }
        
        
    }
    
}
