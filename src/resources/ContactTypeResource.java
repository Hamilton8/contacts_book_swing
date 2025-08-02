
package resources;

import dao.ContactTypeDao;
import interfaces.InterfaceResource;
import model.ContactTypeModel;

public class ContactTypeResource implements InterfaceResource {

    ContactTypeModel ctm = new ContactTypeModel();
    ContactTypeDao ctd = new ContactTypeDao();
    
    @Override
    public void saveResource(Object... values) {
        if("".equals(values[0])){
            ctm.setId(0);
        }else{
            ctm.setId((int)values[0]);
        }
         ctm.setDescription((String)values[1]);
         
         ctd.saveDAO(ctm);
    }

    @Override
    public void deleteResource(int id) {
       
    }

    @Override
    public void rechargeComboBox() {
        
    }
    
}
