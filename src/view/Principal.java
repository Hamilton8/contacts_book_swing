
package view;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    
    public Principal() { 
        setTitle("Contacts Book - Hamilton");
        //setTitle(new String("Hamilton"));
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jmbMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiContact = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmRegister = new javax.swing.JMenu();
        jmiCity = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiArea = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiContactType = new javax.swing.JMenuItem();
        jmAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));

        jDesktop.setBackground(new java.awt.Color(5, 68, 94));

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1489, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jmbMenuBar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jmbMenuBarComponentHidden(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fd.png"))); // NOI18N
        jMenu1.setMnemonic('F');
        jMenu1.setText("File");

        jmiContact.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiContact.setText("Contact");
        jmiContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContactActionPerformed(evt);
            }
        });
        jMenu1.add(jmiContact);
        jMenu1.add(jSeparator3);

        jmRegister.setMnemonic('R');
        jmRegister.setText("Register");

        jmiCity.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCity.setText("City");
        jmiCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCityActionPerformed(evt);
            }
        });
        jmRegister.add(jmiCity);
        jmRegister.add(jSeparator1);

        jmiArea.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiArea.setText("Area");
        jmiArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAreaActionPerformed(evt);
            }
        });
        jmRegister.add(jmiArea);
        jmRegister.add(jSeparator2);

        jmiContactType.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiContactType.setText("Contact Type");
        jmiContactType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContactTypeActionPerformed(evt);
            }
        });
        jmRegister.add(jmiContactType);

        jMenu1.add(jmRegister);

        jmbMenuBar.add(jMenu1);

        jmAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/about.png"))); // NOI18N
        jmAbout.setMnemonic('A');
        jmAbout.setText("About");
        jmbMenuBar.add(jmAbout);

        setJMenuBar(jmbMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAreaActionPerformed
       DefaultForm screen = new AreaView();
       jDesktop.add(screen);
       screen.setVisible(true);
    }//GEN-LAST:event_jmiAreaActionPerformed

    private void jmbMenuBarComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jmbMenuBarComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jmbMenuBarComponentHidden

    private void jmiContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContactActionPerformed
        DefaultForm screen = new ContactView();
        jDesktop.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_jmiContactActionPerformed

    private void jmiCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCityActionPerformed
        DefaultForm screen = new CityView();
        jDesktop.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_jmiCityActionPerformed

    private void jmiContactTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContactTypeActionPerformed
        DefaultForm screen = new ContactTypeView();
        jDesktop.add(screen);
        screen.setVisible(true);
    }//GEN-LAST:event_jmiContactTypeActionPerformed

    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu jmAbout;
    private javax.swing.JMenu jmRegister;
    private javax.swing.JMenuBar jmbMenuBar;
    private javax.swing.JMenuItem jmiArea;
    private javax.swing.JMenuItem jmiCity;
    private javax.swing.JMenuItem jmiContact;
    private javax.swing.JMenuItem jmiContactType;
    // End of variables declaration//GEN-END:variables
}
