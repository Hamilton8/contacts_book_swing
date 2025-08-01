
package view;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class CityView extends DefaultForm{
    JLabel jlZip;
    JTextField jtfZip;
    public CityView(){
        setTitle("City Registration");
        //initializer();
    }

    @Override
    public void initializer() {
        jlZip = new JLabel("ZipCode");
        jlZip.setBounds(10, 65, 60, 25);
        jpnSearch.add(jlZip);
        
        jtfZip = new JTextField();
        jtfZip.setBounds(10, 95, 80, 25);
        jpnSearch.add(jtfZip);
    }

    @Override
    public void saveView() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
