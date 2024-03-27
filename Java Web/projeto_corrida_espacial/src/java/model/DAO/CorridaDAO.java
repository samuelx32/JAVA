/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.DAO.connectionDB.ConnectionJDBC;
import model.persistence.Corrida;

/**
 *
 * @author samue
 */
public class CorridaDAO {
    private Connection con;
    private String sqlComando = null;
    private PreparedStatement psComando = null;

    public boolean salvar(Corrida corr) throws ClassNotFoundException {
        con = new ConnectionJDBC().getConnection();
        
        sqlComando = "insert into corrida(nome, rota, data_corrida, hora_corrida) values (?,?,?,?)";
        
        try{
            
            psComando = con.prepareStatement(sqlComando);
            psComando.setString(1, corr.getNome());
            psComando.setString(2, corr.getRota());
            psComando.setString(3, corr.getData_corrida());
            psComando.setString(4, corr.getHora_corrida());
            
            psComando.executeUpdate();
             
        }catch(SQLException e){
        }

        return true;
    }
    
}
