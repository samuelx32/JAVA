package view;

import controller.UsuarioController;

public class FormUsuario {
        public int id=0;
	public String planeta;
	public int cep;


	public boolean btnSalvar() throws ClassNotFoundException {
            UsuarioController userctrl  = new UsuarioController();               
            //System.out.println(this.logradouro);
            return userctrl.cadastrar(this);
            
	}

}
