
package resources;

import interfaces.InterfaceResource;
import model.ContactTypeModel;

public class ContactTypeResource implements InterfaceResource {

    ContactTypeModel ctm = new ContactTypeModel();
    @Override
    public void saveResource(Object... values) {
         ctm.setId((int)values[0]);
         ctm.setDescription((String)values[1]);
    }

    @Override
    public void deleteResource(int id) {
       
    }

    @Override
    public void rechargeComboBox() {
        
    }
    
}
