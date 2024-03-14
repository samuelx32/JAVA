
package atividademetodos;

/**
 *
 * @author Samuel Sobreira
 */
public class HealthProfile {
    private double peso,altura;
    
    HealthProfile (double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

   
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double imc (double peso, double altura){
        return peso / (altura * altura);
    }
}
