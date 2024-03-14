
package atividademetodos;

/**
 *
 * @author Samuel Sobreira
 */
public class HeartRates {
    private String nome, sobrenome;
    private int dia,mes,ano;
    
    HeartRates (String nome,String sobrenome, int dia, int mes, int ano){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int idade (int ano){
        return 2022 - ano;
    }
    
    public double freq_max(int idade){
        return 220 - idade;
    }
    
    public double freq_alvo(double freq){
        return freq * 0.85;
    }
    
}
