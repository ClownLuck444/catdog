package vista;

public class MasterLogin extends javax.swing.JFrame {

    public MasterLogin() {
        initComponents();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMEDICO = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnEMPLEADO = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnPACIENTE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logo-principal.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 520, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 840));

        jPanel2.setBackground(new java.awt.Color(84, 180, 222));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMEDICO.setBackground(new java.awt.Color(73, 156, 192));
        btnMEDICO.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btnMEDICO.setForeground(new java.awt.Color(255, 255, 255));
        btnMEDICO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/MEDICO.png"))); // NOI18N
        btnMEDICO.setText("MEDICO");
        btnMEDICO.setContentAreaFilled(false);
        jPanel2.add(btnMEDICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 280));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 780, 280));

        jPanel3.setBackground(new java.awt.Color(68, 145, 121));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEMPLEADO.setBackground(new java.awt.Color(73, 131, 113));
        btnEMPLEADO.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btnEMPLEADO.setForeground(new java.awt.Color(255, 255, 255));
        btnEMPLEADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/EMPLEADO.png"))); // NOI18N
        btnEMPLEADO.setText("EMPLEADO");
        btnEMPLEADO.setContentAreaFilled(false);
        btnEMPLEADO.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEMPLEADO.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/EMPLEADO.png"))); // NOI18N
        jPanel3.add(btnEMPLEADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 280));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 780, 280));

        jPanel4.setBackground(new java.awt.Color(182, 160, 124));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPACIENTE.setBackground(new java.awt.Color(150, 124, 83));
        btnPACIENTE.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btnPACIENTE.setForeground(new java.awt.Color(255, 255, 255));
        btnPACIENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/PACIENTE.png"))); // NOI18N
        btnPACIENTE.setText("PACIENTE");
        btnPACIENTE.setContentAreaFilled(false);
        btnPACIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPACIENTEActionPerformed(evt);
            }
        });
        jPanel4.add(btnPACIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 280));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 780, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPACIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPACIENTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPACIENTEActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MasterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEMPLEADO;
    public javax.swing.JButton btnMEDICO;
    public javax.swing.JButton btnPACIENTE;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
