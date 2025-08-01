
package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class AreaView extends DefaultForm{
    private JLabel jlArea;
    private JComboBox jcbArea;
    
    public AreaView(){
        setTitle("Area Registration");
        initializer();
    }

    @Override
    public void initializer() {
        jlArea = new JLabel("City");
        jlArea.setBounds(10, 65, 30, 25);
        jpnSearch.add(jlArea);
        
        jcbArea = new JComboBox();
        jcbArea.setBounds(10, 90, 250, 25);
        jpnSearch.add(jcbArea);
    }

    @Override
    public void saveView() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
