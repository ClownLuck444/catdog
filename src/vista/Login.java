package vista;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        passcontraseña = new javax.swing.JPasswordField();
        txtusuario = new javax.swing.JTextField();
        lblLOGO = new javax.swing.JLabel();
        lblINICIO_SECION = new javax.swing.JLabel();
        lblCONTRASEÑA = new javax.swing.JLabel();
        lblUSUARIO = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblDERECHOS = new javax.swing.JLabel();
        btnREGISTRARSE = new javax.swing.JButton();
        btnACCEDER = new javax.swing.JButton();
        lblIMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("CATDOG");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 490, 40));

        passcontraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passcontraseña.setBorder(null);
        jPanel1.add(passcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 350, 30));

        txtusuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtusuario.setBorder(null);
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 350, 30));

        lblLOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logo-pequeño.png"))); // NOI18N
        jPanel1.add(lblLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 190));

        lblINICIO_SECION.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        lblINICIO_SECION.setForeground(new java.awt.Color(0, 0, 0));
        lblINICIO_SECION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblINICIO_SECION.setText("INICIAR SESIÓN");
        jPanel1.add(lblINICIO_SECION, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 490, 40));

        lblCONTRASEÑA.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCONTRASEÑA.setForeground(new java.awt.Color(0, 0, 0));
        lblCONTRASEÑA.setText("CONTRASEÑA");
        jPanel1.add(lblCONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 130, 20));

        lblUSUARIO.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblUSUARIO.setForeground(new java.awt.Color(0, 0, 0));
        lblUSUARIO.setText("USUARIO");
        jPanel1.add(lblUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 120, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 350, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 350, 10));

        lblDERECHOS.setForeground(new java.awt.Color(0, 0, 0));
        lblDERECHOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDERECHOS.setText("Copyright © Todos los derechos reservados");
        jPanel1.add(lblDERECHOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 490, 40));

        btnREGISTRARSE.setBackground(new java.awt.Color(75, 77, 81));
        btnREGISTRARSE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnREGISTRARSE.setForeground(new java.awt.Color(255, 255, 255));
        btnREGISTRARSE.setText("REGISTRARSE");
        jPanel1.add(btnREGISTRARSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 170, 40));

        btnACCEDER.setBackground(new java.awt.Color(75, 77, 81));
        btnACCEDER.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnACCEDER.setForeground(new java.awt.Color(255, 255, 255));
        btnACCEDER.setText("ACCEDER");
        jPanel1.add(btnACCEDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 710));

        lblIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LOGIN_IMG.png"))); // NOI18N
        getContentPane().add(lblIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 510, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnACCEDER;
    public javax.swing.JButton btnREGISTRARSE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCONTRASEÑA;
    private javax.swing.JLabel lblDERECHOS;
    private javax.swing.JLabel lblIMG;
    private javax.swing.JLabel lblINICIO_SECION;
    private javax.swing.JLabel lblLOGO;
    private javax.swing.JLabel lblUSUARIO;
    public javax.swing.JPasswordField passcontraseña;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}
