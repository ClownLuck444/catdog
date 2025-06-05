package vista;

public class SeleccionarMascota extends javax.swing.JInternalFrame {

    public SeleccionarMascota() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMASCOTA = new javax.swing.JTable();
        btnSELECCIONAR = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMASCOTA.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        tblMASCOTA.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMASCOTA.getTableHeader().setResizingAllowed(false);
        tblMASCOTA.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMASCOTA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1190, 530));

        btnSELECCIONAR.setBackground(new java.awt.Color(75, 77, 81));
        btnSELECCIONAR.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        btnSELECCIONAR.setForeground(new java.awt.Color(255, 255, 255));
        btnSELECCIONAR.setText("SELECCIONAR");
        jPanel1.add(btnSELECCIONAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 250, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSELECCIONAR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblMASCOTA;
    // End of variables declaration//GEN-END:variables

}
