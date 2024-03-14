
package atividademetodos;

/**
 *
 * @author Samuel Sobreira
 */
public class Main {
    public static void main (String []args){
        Produto p = new Produto("Mouse",12,45.2);
        
        System.out.println("Nome: "+p.nome
                +"Quantidade : "+p.quantidade
                +"Preço: "+p.preco+
                "Preço Desconto: "+p.calcDesc(p.preco, p.quantidade));
        
        HeartRates hr = new HeartRates("Joao","Pereira",14,03,1995);
        
        int idade = hr.idade(hr.getAno()); 
        double freqMax = hr.freq_max(idade);
        double freqAlvo = hr.freq_alvo(freqMax);
        
        System.out.println("Nome: "+hr.getNome()
                +"Sobrenome : "+hr.getSobrenome()
                +"Idade: "+idade
                +"Frequencia Maxima: "+freqMax
                +"Frequencia Alvo : "+freqAlvo);
        
        HealthProfile hp = new HealthProfile(74.2, 1.87);
        
        double valorImc = hp.imc(hp.getPeso(),hp.getAltura());
        
        System.out.println("Peso: "+hp.getPeso()
                +"Altura : "+hp.getAltura()
                +"IMC: "+valorImc);
        
    }
}
