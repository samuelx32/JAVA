package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.DAO.connectionDB.ConnectionJDBC;
import model.persistence.Usuario;

public class UsuarioDAO {

    private Connection con;
    private String sqlUsuario = null;
    private PreparedStatement psUsuario = null;

    public boolean salvar(Usuario user) throws ClassNotFoundException {
        con = new ConnectionJDBC().getConnection();
        
        sqlUsuario = "insert into endereco(planeta, cep) values (?,?)";
        
        try{
            
            psUsuario = con.prepareStatement(sqlUsuario);
            psUsuario.setString(1, user.getPlaneta());
            psUsuario.setInt(2, user.getCep());
            
            psUsuario.executeUpdate();
             
        }catch(SQLException e){
        }

        return true;
    }
    
    ////listar
    ///apagar
    //alterar

}


