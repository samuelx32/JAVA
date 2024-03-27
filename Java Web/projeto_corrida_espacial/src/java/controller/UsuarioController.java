package controller;

//import model.DAO.UsuarioDAO;
import model.DAO.UsuarioDAO;
import model.persistence.Usuario;
import view.FormUsuario;

public class UsuarioController {

	public boolean cadastrar(FormUsuario user) throws ClassNotFoundException {
            
            Usuario usuario = new Usuario();
            usuario.setPlaneta(user.planeta);
            usuario.setCep(user.cep);
            
            
           
            
            UsuarioDAO userDAO = new UsuarioDAO();
            
            
            return userDAO.salvar(usuario);
          
        }
}
