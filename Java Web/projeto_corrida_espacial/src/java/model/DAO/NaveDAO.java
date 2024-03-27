package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.DAO.connectionDB.ConnectionJDBC;
import model.persistence.Nave;

public class NaveDAO {

    private Connection con;
    private String sqlComando = null;
    private PreparedStatement psComando = null;

    public boolean salvar(Nave nav) throws ClassNotFoundException {
        con = new ConnectionJDBC().getConnection();
        
        sqlComando = "insert into nave(modelo, peso, numero, codigo) values (?,?,?,?)";
        
        try{
            
            psComando = con.prepareStatement(sqlComando);
            psComando.setString(1, nav.getModelo());
            psComando.setFloat(2, nav.getPeso());
            psComando.setInt(3, nav.getNumero());
            psComando.setString(4, nav.getCodigo());
            
            psComando.executeUpdate();
             
        }catch(SQLException e){
        }

        return true;
    }
    
    ////listar
    ///apagar
    //alterar

}


