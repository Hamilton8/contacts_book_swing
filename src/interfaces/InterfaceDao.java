package interfaces;

import java.sql.SQLException;
import javax.swing.JComboBox;

public interface InterfaceDao {
    public void saveDAO(Object... values);
    public void deleteDAO(int id);
    public void searchDAO(Object... value) throws SQLException;
    public void rechargeComboBoxDAO(JComboBox jcb)throws SQLException;
}
