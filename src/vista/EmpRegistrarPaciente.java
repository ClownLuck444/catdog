package vista;

public class EmpRegistrarPaciente extends javax.swing.JInternalFrame {

    public EmpRegistrarPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGUARDAR_PACIENTE = new javax.swing.JButton();
        btnACTUALIZAR = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtpacientetamaño = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtpacientecolor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtpacienteedad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        dchpacientenacimiento = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        cbxpacienteespecie = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cbxpacientesexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtpacienteraza = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtpacientenombre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtpacientevacunas = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtpropietarionom = new javax.swing.JTextField();
        txtpropietariodni = new javax.swing.JTextField();
        txtpropietariocorr = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtpropietariodir = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtpropietariocel = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtpropietarioape = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtidmascota = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblANIMAL = new javax.swing.JLabel();
        btnBUSCAR = new javax.swing.JButton();
        pnlCOLOR_SEXO = new javax.swing.JPanel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGUARDAR_PACIENTE.setBackground(new java.awt.Color(75, 77, 81));
        btnGUARDAR_PACIENTE.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        btnGUARDAR_PACIENTE.setForeground(new java.awt.Color(255, 255, 255));
        btnGUARDAR_PACIENTE.setText("REGISTRAR");
        jPanel1.add(btnGUARDAR_PACIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 1280, 30));

        btnACTUALIZAR.setBackground(new java.awt.Color(75, 77, 81));
        btnACTUALIZAR.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        btnACTUALIZAR.setForeground(new java.awt.Color(255, 255, 255));
        btnACTUALIZAR.setText("ACTUALIZAR");
        jPanel1.add(btnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 270, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 26, 26));
        jLabel4.setText("TAMAÑO");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, -1));

        txtpacientetamaño.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpacientetamaño.setBorder(null);
        jPanel5.add(txtpacientetamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 340, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(29, 26, 26));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("COLOR");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 250, -1));

        txtpacientecolor.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpacientecolor.setBorder(null);
        jPanel5.add(txtpacientecolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 340, 30));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 340, 10));

        txtpacienteedad.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpacienteedad.setBorder(null);
        jPanel5.add(txtpacienteedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 340, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(29, 26, 26));
        jLabel12.setText("EDAD");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 250, -1));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 340, 10));
        jPanel5.add(dchpacientenacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 340, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(29, 26, 26));
        jLabel19.setText("FECHA DE NACIMIENTO");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 280, -1));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 340, 10));

        cbxpacienteespecie.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        cbxpacienteespecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxpacienteespecie.setBorder(null);
        jPanel5.add(cbxpacienteespecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 340, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(29, 26, 26));
        jLabel15.setText("ESPECIE");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 250, -1));

        cbxpacientesexo.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        cbxpacientesexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxpacientesexo.setBorder(null);
        jPanel5.add(cbxpacientesexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 340, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(29, 26, 26));
        jLabel10.setText("SEXO");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 250, -1));

        txtpacienteraza.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpacienteraza.setBorder(null);
        jPanel5.add(txtpacienteraza, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 340, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(29, 26, 26));
        jLabel16.setText("RAZA");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 250, -1));

        txtpacientenombre.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpacientenombre.setBorder(null);
        jPanel5.add(txtpacientenombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 340, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(29, 26, 26));
        jLabel21.setText("NOMBRE DE LA MASCOTA");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 250, -1));

        txtpacientevacunas.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpacientevacunas.setBorder(null);
        jPanel5.add(txtpacientevacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 340, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(29, 26, 26));
        jLabel17.setText("VACUNAS");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 250, -1));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 340, 10));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 340, 10));
        jPanel5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 340, 10));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 480, 620));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpropietarionom.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpropietarionom.setBorder(null);
        jPanel2.add(txtpropietarionom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 340, 30));

        txtpropietariodni.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpropietariodni.setBorder(null);
        jPanel2.add(txtpropietariodni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 340, 30));

        txtpropietariocorr.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpropietariocorr.setBorder(null);
        jPanel2.add(txtpropietariocorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 340, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("CORREO ELECTRONICO");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("NOMBRE");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtpropietariodir.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpropietariodir.setBorder(null);
        jPanel2.add(txtpropietariodir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 340, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("DIRECCIÓN");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        txtpropietariocel.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpropietariocel.setBorder(null);
        jPanel2.add(txtpropietariocel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 340, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("CELULAR");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        txtpropietarioape.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtpropietarioape.setBorder(null);
        jPanel2.add(txtpropietarioape, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 340, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("APELLIDO");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 340, 10));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 340, 10));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 340, 10));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 340, 10));
        jPanel2.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 340, 10));
        jPanel2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 340, 10));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("N° DE DNI DEL PROPIETARIO");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 280, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 480, 630));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(188, 151, 77));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DATOS DEL PROPIETARIO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 480, 60));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(188, 151, 77));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("DATOS DEL PACIENTE");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 480, 60));

        txtidmascota.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtidmascota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtidmascota.setBorder(null);
        jPanel1.add(txtidmascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 180, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(29, 26, 26));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ID MASCOTA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 180, -1));

        lblANIMAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblANIMAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/PERRO.png"))); // NOI18N
        jPanel1.add(lblANIMAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 320, 300));

        btnBUSCAR.setBackground(new java.awt.Color(75, 77, 81));
        btnBUSCAR.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        btnBUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR.setText("BUSCAR");
        jPanel1.add(btnBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 180, 30));

        pnlCOLOR_SEXO.setBackground(new java.awt.Color(54, 98, 190));
        pnlCOLOR_SEXO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(pnlCOLOR_SEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 180, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnACTUALIZAR;
    public javax.swing.JButton btnBUSCAR;
    public javax.swing.JButton btnGUARDAR_PACIENTE;
    public javax.swing.JComboBox<String> cbxpacienteespecie;
    public javax.swing.JComboBox<String> cbxpacientesexo;
    public com.toedter.calendar.JDateChooser dchpacientenacimiento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JLabel lblANIMAL;
    public javax.swing.JPanel pnlCOLOR_SEXO;
    public javax.swing.JTextField txtidmascota;
    public javax.swing.JTextField txtpacientecolor;
    public javax.swing.JTextField txtpacienteedad;
    public javax.swing.JTextField txtpacientenombre;
    public javax.swing.JTextField txtpacienteraza;
    public javax.swing.JTextField txtpacientetamaño;
    public javax.swing.JTextField txtpacientevacunas;
    public javax.swing.JTextField txtpropietarioape;
    public javax.swing.JTextField txtpropietariocel;
    public javax.swing.JTextField txtpropietariocorr;
    public javax.swing.JTextField txtpropietariodir;
    public javax.swing.JTextField txtpropietariodni;
    public javax.swing.JTextField txtpropietarionom;
    // End of variables declaration//GEN-END:variables

}
