package vista;

public class EmpConsultar extends javax.swing.JInternalFrame {

    public EmpConsultar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpEleccion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMASCOTAS_DUEÑOS = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblELIMINAR = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnREFRESCAR = new javax.swing.JButton();
        rbtnmasco = new javax.swing.JRadioButton();
        btnBUSCAR_MASCOTA = new javax.swing.JButton();
        btnBUSCAR_DUEÑO = new javax.swing.JButton();
        rbtndueño = new javax.swing.JRadioButton();
        txtnombremascota = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtDNIdueño = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblACTUALIZAR = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMASCOTAS_DUEÑOS.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        tblMASCOTAS_DUEÑOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMASCOTAS_DUEÑOS.setAutoscrolls(false);
        tblMASCOTAS_DUEÑOS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblMASCOTAS_DUEÑOS.setInheritsPopupMenu(true);
        tblMASCOTAS_DUEÑOS.getTableHeader().setResizingAllowed(false);
        tblMASCOTAS_DUEÑOS.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMASCOTAS_DUEÑOS);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 1160, 360));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 77, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 40));

        jPanel4.setBackground(new java.awt.Color(182, 182, 182));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1156, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1160, 30));

        lblELIMINAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jPanel1.add(lblELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 230, 160));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ELIMINAR");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 230, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ACTUALIZAR");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 259, 230, 20));

        btnREFRESCAR.setBackground(new java.awt.Color(75, 77, 81));
        btnREFRESCAR.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnREFRESCAR.setForeground(new java.awt.Color(255, 255, 255));
        btnREFRESCAR.setText("REFRESCAR TABLA");
        jPanel1.add(btnREFRESCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 1160, 30));

        rbtnmasco.setBackground(new java.awt.Color(75, 77, 81));
        btngrpEleccion.add(rbtnmasco);
        rbtnmasco.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        rbtnmasco.setForeground(new java.awt.Color(255, 255, 255));
        rbtnmasco.setSelected(true);
        rbtnmasco.setText("MOSTRAR MASCOTAS");
        rbtnmasco.setBorder(null);
        jPanel1.add(rbtnmasco, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 230, 40));

        btnBUSCAR_MASCOTA.setBackground(new java.awt.Color(75, 77, 81));
        btnBUSCAR_MASCOTA.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        btnBUSCAR_MASCOTA.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR_MASCOTA.setText("BUSCAR");
        jPanel1.add(btnBUSCAR_MASCOTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 140, 30));

        btnBUSCAR_DUEÑO.setBackground(new java.awt.Color(75, 77, 81));
        btnBUSCAR_DUEÑO.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        btnBUSCAR_DUEÑO.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR_DUEÑO.setText("BUSCAR");
        jPanel1.add(btnBUSCAR_DUEÑO, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 140, 30));

        rbtndueño.setBackground(new java.awt.Color(75, 77, 81));
        btngrpEleccion.add(rbtndueño);
        rbtndueño.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        rbtndueño.setForeground(new java.awt.Color(255, 255, 255));
        rbtndueño.setText("MOSTRAR PROPIETARIOS");
        rbtndueño.setBorder(null);
        jPanel1.add(rbtndueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 230, 40));

        txtnombremascota.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtnombremascota.setBorder(null);
        jPanel1.add(txtnombremascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 220, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(29, 26, 26));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("NOMBRE DE LA MASCOTA:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 220, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(29, 26, 26));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("N° DNI DEL PROPIETARIO:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 220, 30));

        txtDNIdueño.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtDNIdueño.setBorder(null);
        jPanel1.add(txtDNIdueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 220, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 220, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 220, 10));

        lblACTUALIZAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblACTUALIZAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        jPanel1.add(lblACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 230, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBUSCAR_DUEÑO;
    public javax.swing.JButton btnBUSCAR_MASCOTA;
    public javax.swing.JButton btnREFRESCAR;
    public javax.swing.ButtonGroup btngrpEleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lblACTUALIZAR;
    public javax.swing.JLabel lblELIMINAR;
    public javax.swing.JRadioButton rbtndueño;
    public javax.swing.JRadioButton rbtnmasco;
    public javax.swing.JTable tblMASCOTAS_DUEÑOS;
    public javax.swing.JTextField txtDNIdueño;
    public javax.swing.JTextField txtnombremascota;
    // End of variables declaration//GEN-END:variables

}
