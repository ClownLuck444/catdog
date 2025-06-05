package vista;


public class MedConsultarCitas extends javax.swing.JInternalFrame {

    public MedConsultarCitas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCITAS = new javax.swing.JTable();
        dchbuscarfechacita = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        btnBUSCAR_FECHA = new javax.swing.JButton();
        btnSELECCIONAR_CITA = new javax.swing.JButton();
        cbxarea = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 77, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAR CITAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1370, 50));

        jPanel4.setBackground(new java.awt.Color(182, 182, 182));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1296, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1300, 30));

        jPanel2.setBackground(new java.awt.Color(188, 151, 77));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCITAS.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblCITAS.getTableHeader().setResizingAllowed(false);
        tblCITAS.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCITAS);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1280, 430));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1300, 450));
        jPanel1.add(dchbuscarfechacita, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 260, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(29, 26, 26));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("AREA");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 260, 30));

        btnBUSCAR_FECHA.setBackground(new java.awt.Color(75, 77, 81));
        btnBUSCAR_FECHA.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        btnBUSCAR_FECHA.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR_FECHA.setText("BUSCAR");
        jPanel1.add(btnBUSCAR_FECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 140, 30));

        btnSELECCIONAR_CITA.setBackground(new java.awt.Color(75, 77, 81));
        btnSELECCIONAR_CITA.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        btnSELECCIONAR_CITA.setForeground(new java.awt.Color(255, 255, 255));
        btnSELECCIONAR_CITA.setText("SELECCIONAR");
        btnSELECCIONAR_CITA.setEnabled(false);
        jPanel1.add(btnSELECCIONAR_CITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 640, 240, 30));

        cbxarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 260, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(29, 26, 26));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("FECHA");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 260, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBUSCAR_FECHA;
    public javax.swing.JButton btnSELECCIONAR_CITA;
    public javax.swing.JComboBox<String> cbxarea;
    public com.toedter.calendar.JDateChooser dchbuscarfechacita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblCITAS;
    // End of variables declaration//GEN-END:variables

}
