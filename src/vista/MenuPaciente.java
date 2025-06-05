package vista;


public class MenuPaciente extends javax.swing.JFrame {

    public MenuPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtkpContenedorCliente = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCONSULTAR = new javax.swing.JMenu();
        mitemCONSULTAR_CITA = new javax.swing.JMenuItem();
        mitemCONSULTAR_HISTORIA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dtkpContenedorCliente.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dtkpContenedorClienteLayout = new javax.swing.GroupLayout(dtkpContenedorCliente);
        dtkpContenedorCliente.setLayout(dtkpContenedorClienteLayout);
        dtkpContenedorClienteLayout.setHorizontalGroup(
            dtkpContenedorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
        );
        dtkpContenedorClienteLayout.setVerticalGroup(
            dtkpContenedorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );

        menuCONSULTAR.setText("CONSULTAR");

        mitemCONSULTAR_CITA.setText("CONSULTAR CITA");
        menuCONSULTAR.add(mitemCONSULTAR_CITA);

        mitemCONSULTAR_HISTORIA.setText("CONSULTAR HISTORIAL CLINICO");
        menuCONSULTAR.add(mitemCONSULTAR_HISTORIA);

        jMenuBar1.add(menuCONSULTAR);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtkpContenedorCliente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtkpContenedorCliente, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane dtkpContenedorCliente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCONSULTAR;
    public javax.swing.JMenuItem mitemCONSULTAR_CITA;
    public javax.swing.JMenuItem mitemCONSULTAR_HISTORIA;
    // End of variables declaration//GEN-END:variables

}
