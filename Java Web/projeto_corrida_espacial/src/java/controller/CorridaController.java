/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.DAO.CorridaDAO;
import model.persistence.Corrida;
import view.FormCorrida;

/**
 *
 * @author samue
 */
public class CorridaController {
    public boolean cadastrar(FormCorrida corr) throws ClassNotFoundException {
            
            Corrida cor = new Corrida();
            cor.setNome(corr.nome);
            cor.setRota(corr.rota);
            cor.setData_corrida(corr.data_corrida);
            cor.setHora_corrida(corr.hora_corrida);
            
            
           
            
            CorridaDAO corrDAO = new CorridaDAO();
            
            
            return corrDAO.salvar(cor);
          
        }
}
