package vista;

public class MenuEmpleado extends javax.swing.JFrame {

    public MenuEmpleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtkpContenedorEmpleado = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuPACIENTE = new javax.swing.JMenu();
        mitemREGISTRAR_PACIENTE = new javax.swing.JMenuItem();
        mitemCONSULTAR_PACIENTE = new javax.swing.JMenuItem();
        menuCITAS = new javax.swing.JMenu();
        mitemREGISTRAR_CITA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dtkpContenedorEmpleado.setBackground(new java.awt.Color(241, 241, 241));

        javax.swing.GroupLayout dtkpContenedorEmpleadoLayout = new javax.swing.GroupLayout(dtkpContenedorEmpleado);
        dtkpContenedorEmpleado.setLayout(dtkpContenedorEmpleadoLayout);
        dtkpContenedorEmpleadoLayout.setHorizontalGroup(
            dtkpContenedorEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1237, Short.MAX_VALUE)
        );
        dtkpContenedorEmpleadoLayout.setVerticalGroup(
            dtkpContenedorEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );

        menuPACIENTE.setText("PACIENTES");

        mitemREGISTRAR_PACIENTE.setText("REGISTRAR PACIENTE");
        menuPACIENTE.add(mitemREGISTRAR_PACIENTE);

        mitemCONSULTAR_PACIENTE.setText("CONSULTAR PACIENTE");
        menuPACIENTE.add(mitemCONSULTAR_PACIENTE);

        jMenuBar2.add(menuPACIENTE);

        menuCITAS.setText("CITAS");

        mitemREGISTRAR_CITA.setText("REGISTRAR CITA");
        menuCITAS.add(mitemREGISTRAR_CITA);

        jMenuBar2.add(menuCITAS);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtkpContenedorEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtkpContenedorEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane dtkpContenedorEmpleado;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu menuCITAS;
    private javax.swing.JMenu menuPACIENTE;
    public javax.swing.JMenuItem mitemCONSULTAR_PACIENTE;
    public javax.swing.JMenuItem mitemREGISTRAR_CITA;
    public javax.swing.JMenuItem mitemREGISTRAR_PACIENTE;
    // End of variables declaration//GEN-END:variables

}
