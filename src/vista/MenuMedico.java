package vista;


public class MenuMedico extends javax.swing.JFrame {

    public MenuMedico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtkpContenedorMedico = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCITAS = new javax.swing.JMenu();
        mitemCONSULTAR_CITAS = new javax.swing.JMenuItem();
        menuHISTORIAL_CLINICO = new javax.swing.JMenu();
        mitemREGISTRAR_HISTORIA = new javax.swing.JMenuItem();
        mitemCONSULTAR_HISTORIA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dtkpContenedorMedico.setBackground(new java.awt.Color(241, 241, 241));

        javax.swing.GroupLayout dtkpContenedorMedicoLayout = new javax.swing.GroupLayout(dtkpContenedorMedico);
        dtkpContenedorMedico.setLayout(dtkpContenedorMedicoLayout);
        dtkpContenedorMedicoLayout.setHorizontalGroup(
            dtkpContenedorMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1283, Short.MAX_VALUE)
        );
        dtkpContenedorMedicoLayout.setVerticalGroup(
            dtkpContenedorMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        menuCITAS.setText("CITAS");

        mitemCONSULTAR_CITAS.setText("CONSULTAR CITAS");
        menuCITAS.add(mitemCONSULTAR_CITAS);

        jMenuBar1.add(menuCITAS);

        menuHISTORIAL_CLINICO.setText("HISTORIAL CLINICO");

        mitemREGISTRAR_HISTORIA.setText("REGISTRAR HISTORIAL CLINICO");
        menuHISTORIAL_CLINICO.add(mitemREGISTRAR_HISTORIA);

        mitemCONSULTAR_HISTORIA.setText("CONSULTAR HISTORIAL CLINICO");
        menuHISTORIAL_CLINICO.add(mitemCONSULTAR_HISTORIA);

        jMenuBar1.add(menuHISTORIAL_CLINICO);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtkpContenedorMedico)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtkpContenedorMedico)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane dtkpContenedorMedico;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCITAS;
    private javax.swing.JMenu menuHISTORIAL_CLINICO;
    public javax.swing.JMenuItem mitemCONSULTAR_CITAS;
    public javax.swing.JMenuItem mitemCONSULTAR_HISTORIA;
    public javax.swing.JMenuItem mitemREGISTRAR_HISTORIA;
    // End of variables declaration//GEN-END:variables

}
