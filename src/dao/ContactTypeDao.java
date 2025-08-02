package dao;

import interfaces.InterfaceDao;
import java.sql.SQLException;
import javax.swing.JComboBox;
import model.ContactTypeModel;

public class ContactTypeDao implements InterfaceDao{

    @Override
    public void saveDAO(Object... values) {
        ContactTypeModel ctm = (ContactTypeModel)values[0];
    }

    @Override
    public void deleteDAO(int id) {
        
    }

    @Override
    public void searchDAO(Object... value) throws SQLException {
        
    }

    @Override
    public void rechargeComboBoxDAO(JComboBox jcb) throws SQLException {
        
    }
    
}
