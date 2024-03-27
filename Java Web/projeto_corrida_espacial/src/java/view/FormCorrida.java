package view;

import controller.CorridaController;

public class FormCorrida {
	public String nome;
	public String rota;
        public String data_corrida;
        public String hora_corrida;


	public boolean btnSalvar() throws ClassNotFoundException {
            CorridaController corrctrl  = new CorridaController();               
            //System.out.println(this.logradouro);
            return corrctrl.cadastrar(this);
            
	}

}
