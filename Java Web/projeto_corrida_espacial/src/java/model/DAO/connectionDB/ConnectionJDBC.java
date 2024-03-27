package model.DAO.connectionDB;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionJDBC {

    String usuario = "root";
    String senha = "pantera2256!";
    String url = "jdbc:mysql://localhost:3306/corrida_espacial";
    String driver = "com.mysql.jdbc.Driver";

    Connection con = null;

    public Connection getConnection() {

        try {
            if (con == null) {
                Class.forName(driver);
                con = (Connection) DriverManager.getConnection(url, usuario, senha);
                System.out.println("Conexão ativa");
            } else if (con.isClosed()) {
                System.out.println("Conexão erro 1");
                con = null;
                //return getConnection(); 
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexão erro 2");
        }
        return con;
    }

    public boolean closeConnection() throws SQLException {
        if (con != null) {
            con.close();
        }
        return false;
    }

}
