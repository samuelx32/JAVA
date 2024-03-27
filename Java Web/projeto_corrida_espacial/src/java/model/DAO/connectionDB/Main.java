/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO.connectionDB;

/**
 *
 * @author samue
 */
public class Main {
    public static void main (String [] args){
        ConnectionJDBC com = new ConnectionJDBC();
        com.getConnection();
    }
}
