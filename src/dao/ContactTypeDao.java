package dao;

import interfaces.InterfaceDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.ContactTypeModel;

public class ContactTypeDao implements InterfaceDao{
    private Connection connection;
    String sql;
    
    public ContactTypeDao(){
        
    } 
    
    public ContactTypeDao(Connection connection){
        this.connection = connection;
    }
    //ContactTypeDao ctd = DaoFactory.createContactTypeDao();
    
    @Override
    public void saveDAO(Object... values) {
        connection = ConnectionBase.getConnection();
        ContactTypeModel ctm = (ContactTypeModel)values[0];
        PreparedStatement preparedStatement = null;
        try{
            if(ctm.getId()==0){
                sql = "INSERT INTO contacts_type (description) VALUE(?)";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, ctm.getDescription());
                
            }else{
                sql = "UPDATE contacts_type SET description = ? WHERE contacts_type_id = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, ctm.getDescription());
                preparedStatement.setInt(1, ctm.getId());
            }
            preparedStatement = connection.prepareStatement(sql);
            int rowsAffected = preparedStatement.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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
