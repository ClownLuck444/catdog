package vista;


public class Registrarse extends javax.swing.JFrame {

    public Registrarse() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        cbxcargo = new javax.swing.JComboBox<>();
        btnCANCELAR = new javax.swing.JButton();
        btnREGISTRARSE = new javax.swing.JButton();
        pssconfirmarcontraseña = new javax.swing.JPasswordField();
        psscontraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LOGIN_IMG.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 77, 81));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRARSE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 360, 10));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CONFIRMAR CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 250, 20));

        txtdni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtdni.setBorder(null);
        jPanel1.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 360, 40));

        txtnombres.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtnombres.setBorder(null);
        jPanel1.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 360, 40));

        txtapellidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtapellidos.setBorder(null);
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 360, 40));

        txtusuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtusuario.setBorder(null);
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 360, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DNI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 240, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("APELLIDOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 240, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CARGO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 240, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("USUARIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 250, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("CONTRASEÑA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 250, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 360, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 360, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 360, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 360, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 360, 10));

        cbxcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxcargo.setBorder(null);
        jPanel1.add(cbxcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 360, 40));

        btnCANCELAR.setBackground(new java.awt.Color(75, 77, 81));
        btnCANCELAR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCANCELAR.setForeground(new java.awt.Color(255, 255, 255));
        btnCANCELAR.setText("CANCELAR");
        jPanel1.add(btnCANCELAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 160, 40));

        btnREGISTRARSE.setBackground(new java.awt.Color(75, 77, 81));
        btnREGISTRARSE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnREGISTRARSE.setForeground(new java.awt.Color(255, 255, 255));
        btnREGISTRARSE.setText("REGISTRARSE");
        jPanel1.add(btnREGISTRARSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, 160, 40));

        pssconfirmarcontraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pssconfirmarcontraseña.setBorder(null);
        jPanel1.add(pssconfirmarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 360, 40));

        psscontraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        psscontraseña.setBorder(null);
        jPanel1.add(psscontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 360, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCANCELAR;
    public javax.swing.JButton btnREGISTRARSE;
    public javax.swing.JComboBox<String> cbxcargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JPasswordField pssconfirmarcontraseña;
    public javax.swing.JPasswordField psscontraseña;
    public javax.swing.JTextField txtapellidos;
    public javax.swing.JTextField txtdni;
    public javax.swing.JTextField txtnombres;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}
