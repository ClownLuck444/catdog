package vista;


public class PacConsultarCita extends javax.swing.JInternalFrame {

    public PacConsultarCita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtdni = new javax.swing.JTextField();
        btnBUSCAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCONSULTAR_CITA = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 77, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAR CITA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1230, 50));

        jPanel4.setBackground(new java.awt.Color(182, 182, 182));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1176, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1180, 30));

        txtdni.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtdni.setBorder(null);
        jPanel1.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 260, 30));

        btnBUSCAR.setBackground(new java.awt.Color(75, 77, 81));
        btnBUSCAR.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        btnBUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR.setText("BUSCAR");
        jPanel1.add(btnBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 160, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESAR N° DE DNI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 200, 30));

        jPanel2.setBackground(new java.awt.Color(188, 151, 77));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCONSULTAR_CITA.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblCONSULTAR_CITA.getTableHeader().setResizingAllowed(false);
        tblCONSULTAR_CITA.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCONSULTAR_CITA);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1160, 230));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1180, 250));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 260, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBUSCAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tblCONSULTAR_CITA;
    public javax.swing.JTextField txtdni;
    // End of variables declaration//GEN-END:variables

}
