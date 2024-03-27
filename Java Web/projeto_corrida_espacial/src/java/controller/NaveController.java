package controller;

import model.DAO.NaveDAO;
import model.persistence.Nave;
import view.FormNave;

public class NaveController {

    public boolean cadastrar(FormNave nav) throws ClassNotFoundException {
            
            Nave nav1 = new Nave();
            
            nav1.setModelo(nav.modelo);
            nav1.setPeso(nav.peso);
            nav1.setNumero(nav.numero);
            nav1.setCodigo(nav.codigo);
            
            NaveDAO navDAO = new NaveDAO();
            
            return navDAO.salvar(nav1);
        }
}
