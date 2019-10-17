package inicio;

/**
 *
 * @author Rut Teran
 */
public class inicio extends javax.swing.JFrame 
{

    /**
     * Creates new form menu_principal
     */
    public inicio() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbx1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 50)); // NOI18N
        jLabel1.setText("BIENVENIDOS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 20, 480, 59);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione el problema que desea analizar");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 170, 400, 23);

        cbx1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        cbx1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OPCIONES", "StringE", "minCat", "Has271", "StringSplosion", "TeaParty", "BlueTicket", "MapBully", "MidThree" }));
        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });
        jPanel1.add(cbx1);
        cbx1.setBounds(400, 200, 120, 21);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eed.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-110, 0, 830, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
                
        dispose();
        
        switch(cbx1.getSelectedIndex())
        {
            case 0:
                new inicio().setVisible(true);
                this.dispose();
                break;
                
            case 1:
                new StringE().setVisible(true);
                this.dispose();
                break;
                
            case 2:
                new minCat().setVisible(true);
                this.dispose();
                break;
                
            case 3:
                new Has271().setVisible(true);
                this.dispose();
                break;
                
            case 4:
                new StringSplosion().setVisible(true);
                this.dispose();
                break;
                
            case 5:
                new TeaParty().setVisible(true);
                this.dispose();
                break;
              
            case 6:
                new BlueTicket().setVisible(true);
                this.dispose();
                break;
                
            case 7:
                new MapBully().setVisible(true);
                this.dispose();
                break;
              
            case 8:
                new MidThree().setVisible(true);
                this.dispose();
                break;
                
        }
        
    }//GEN-LAST:event_cbx1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbx1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
