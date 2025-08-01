
package view;

import resources.ContactTypeResource;

public class ContactTypeView extends DefaultForm{
    public ContactTypeView(){
        setTitle("Contact Type Registration");
    }

    @Override
    public void initializer() {
         
    }

    ContactTypeResource ctr = new ContactTypeResource();
    
    @Override
    public void saveView() {
        ctr.saveResource(jtfId.getText(),jtfDescription.getText());
        
    }
}
