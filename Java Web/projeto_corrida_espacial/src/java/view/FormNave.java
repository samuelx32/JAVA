package view;
import controller.NaveController;


public class FormNave {
    public int id;
    public String modelo;
    public float peso;
    public int numero;
    public String codigo;
    
    
    public boolean btnSalvar() throws ClassNotFoundException {
            NaveController navectrl  = new NaveController();               
            //System.out.println(this.logradouro);
            return navectrl.cadastrar(this);     
	}
}
