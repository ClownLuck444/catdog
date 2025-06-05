package vista;


public class EmpRegistrarCita extends javax.swing.JInternalFrame {

    public EmpRegistrarCita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtmascostaid = new javax.swing.JTextField();
        txtmascostasex = new javax.swing.JTextField();
        txtmascostanom = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtmascotaesp = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        txtdetallescita = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        btnBUSCAR_PACIENTES = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnACTUALIZAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        dchfechabuscar = new com.toedter.calendar.JDateChooser();
        cbxareabuscar = new javax.swing.JComboBox<>();
        btnBUSCAR = new javax.swing.JButton();
        btnMOSTRAR_TODO = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCITAS = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        cbxarea = new javax.swing.JComboBox<>();
        dchfechacita = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        cbxcitaestado = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        txtcitahora = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnNUEVA_CITA = new javax.swing.JButton();
        btnREGISTRAR_CITA = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtdueñoapell = new javax.swing.JTextField();
        txtdueñonombre = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtdueñodni = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtdueñocell = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 77, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR CITA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 1070, 50));

        jPanel4.setBackground(new java.awt.Color(182, 182, 182));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 1050, 30));

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DATOS DE LA MASCOTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(29, 26, 26));
        jLabel27.setText("ID MASCOTA");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(29, 26, 26));
        jLabel29.setText("ESPECIE");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtmascostaid.setEditable(false);
        txtmascostaid.setBackground(new java.awt.Color(241, 241, 241));
        txtmascostaid.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtmascostaid.setForeground(new java.awt.Color(0, 0, 0));
        txtmascostaid.setBorder(null);
        jPanel3.add(txtmascostaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 300, 30));

        txtmascostasex.setEditable(false);
        txtmascostasex.setBackground(new java.awt.Color(241, 241, 241));
        txtmascostasex.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtmascostasex.setForeground(new java.awt.Color(0, 0, 0));
        txtmascostasex.setBorder(null);
        jPanel3.add(txtmascostasex, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 300, 30));

        txtmascostanom.setEditable(false);
        txtmascostanom.setBackground(new java.awt.Color(241, 241, 241));
        txtmascostanom.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtmascostanom.setForeground(new java.awt.Color(0, 0, 0));
        txtmascostanom.setBorder(null);
        jPanel3.add(txtmascostanom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(29, 26, 26));
        jLabel30.setText("SEXO");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtmascotaesp.setEditable(false);
        txtmascotaesp.setBackground(new java.awt.Color(241, 241, 241));
        txtmascotaesp.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtmascotaesp.setForeground(new java.awt.Color(0, 0, 0));
        txtmascotaesp.setBorder(null);
        jPanel3.add(txtmascotaesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 300, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(29, 26, 26));
        jLabel28.setText("NOMBRE DEL PACIENTE");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 300, 10));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 300, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 300, 10));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 300, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 380, 320));

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtdetallescita.setBackground(new java.awt.Color(241, 241, 241));
        txtdetallescita.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtdetallescita.setBorder(null);
        jPanel5.add(txtdetallescita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 440, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(29, 26, 26));
        jLabel34.setText("DETALLES ESPECIFICOS DE LA CITA:");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 360, 30));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 440, 10));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 520, 110));

        btnBUSCAR_PACIENTES.setBackground(new java.awt.Color(75, 77, 81));
        btnBUSCAR_PACIENTES.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        btnBUSCAR_PACIENTES.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR_PACIENTES.setText("BUSCAR PACIENTE");
        jPanel1.add(btnBUSCAR_PACIENTES, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 380, 30));

        jPanel6.setBackground(new java.awt.Color(188, 151, 77));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnACTUALIZAR.setBackground(new java.awt.Color(255, 255, 255));
        btnACTUALIZAR.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnACTUALIZAR.setForeground(new java.awt.Color(0, 0, 0));
        btnACTUALIZAR.setText("ACTUALIZAR");
        jPanel6.add(btnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 440, 30));

        btnELIMINAR.setBackground(new java.awt.Color(255, 255, 255));
        btnELIMINAR.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnELIMINAR.setForeground(new java.awt.Color(0, 0, 0));
        btnELIMINAR.setText("ELIMINAR");
        jPanel6.add(btnELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 440, 30));
        jPanel6.add(dchfechabuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 260, 30));

        cbxareabuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(cbxareabuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 30));

        btnBUSCAR.setBackground(new java.awt.Color(255, 255, 255));
        btnBUSCAR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBUSCAR.setForeground(new java.awt.Color(0, 0, 0));
        btnBUSCAR.setText("BUSCAR");
        jPanel6.add(btnBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 200, 40));

        btnMOSTRAR_TODO.setBackground(new java.awt.Color(255, 255, 255));
        btnMOSTRAR_TODO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMOSTRAR_TODO.setForeground(new java.awt.Color(0, 0, 0));
        btnMOSTRAR_TODO.setText("MOSTRAR TODO");
        jPanel6.add(btnMOSTRAR_TODO, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 20, 200, 40));

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("FECHA");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 260, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("ÁREA");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 280, -1));

        tblCITAS.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        tblCITAS.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCITAS.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblCITAS.setAutoscrolls(false);
        tblCITAS.getTableHeader().setResizingAllowed(false);
        tblCITAS.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCITAS);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1004, 380));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 1050, 500));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(29, 26, 26));
        jLabel16.setText("ÁREA:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 190, -1));

        cbxarea.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        cbxarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 250, 30));
        jPanel1.add(dchfechacita, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 250, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(29, 26, 26));
        jLabel17.setText("ESTADO DE CITA:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 190, -1));

        cbxcitaestado.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        cbxcitaestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxcitaestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 220, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(29, 26, 26));
        jLabel33.setText("HORA DE LA CITA:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 170, -1));

        txtcitahora.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtcitahora.setBorder(null);
        jPanel1.add(txtcitahora, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 220, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 220, 10));

        btnNUEVA_CITA.setBackground(new java.awt.Color(75, 77, 81));
        btnNUEVA_CITA.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnNUEVA_CITA.setForeground(new java.awt.Color(255, 255, 255));
        btnNUEVA_CITA.setText("NUEVA CITA");
        jPanel1.add(btnNUEVA_CITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 240, 460, 30));

        btnREGISTRAR_CITA.setBackground(new java.awt.Color(75, 77, 81));
        btnREGISTRAR_CITA.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnREGISTRAR_CITA.setForeground(new java.awt.Color(255, 255, 255));
        btnREGISTRAR_CITA.setText("AGENDAR CITA");
        jPanel1.add(btnREGISTRAR_CITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 440, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(188, 151, 77));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Fecha");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 30));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(188, 151, 77));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Hora");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 150, 30));

        txtHora.setEditable(false);
        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 150, 40));

        jLabel35.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(29, 26, 26));
        jLabel35.setText("FECHA DE LA CITA:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 180, -1));

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DATOS DEL PROPIETARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtdueñoapell.setEditable(false);
        txtdueñoapell.setBackground(new java.awt.Color(241, 241, 241));
        txtdueñoapell.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtdueñoapell.setForeground(new java.awt.Color(0, 0, 0));
        txtdueñoapell.setBorder(null);
        jPanel2.add(txtdueñoapell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 300, 30));

        txtdueñonombre.setEditable(false);
        txtdueñonombre.setBackground(new java.awt.Color(241, 241, 241));
        txtdueñonombre.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtdueñonombre.setForeground(new java.awt.Color(0, 0, 0));
        txtdueñonombre.setBorder(null);
        jPanel2.add(txtdueñonombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(29, 26, 26));
        jLabel23.setText("NOMBRE DEL DUEÑO");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(29, 26, 26));
        jLabel24.setText("APELLIDO");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(29, 26, 26));
        jLabel25.setText("N° DE DNI");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtdueñodni.setEditable(false);
        txtdueñodni.setBackground(new java.awt.Color(241, 241, 241));
        txtdueñodni.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtdueñodni.setForeground(new java.awt.Color(0, 0, 0));
        txtdueñodni.setBorder(null);
        jPanel2.add(txtdueñodni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 300, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(29, 26, 26));
        jLabel26.setText("CELULAR");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtdueñocell.setEditable(false);
        txtdueñocell.setBackground(new java.awt.Color(241, 241, 241));
        txtdueñocell.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtdueñocell.setForeground(new java.awt.Color(0, 0, 0));
        txtdueñocell.setBorder(null);
        jPanel2.add(txtdueñocell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 300, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 300, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 300, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 300, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 300, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 380, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnACTUALIZAR;
    public javax.swing.JButton btnBUSCAR;
    public javax.swing.JButton btnBUSCAR_PACIENTES;
    public javax.swing.JButton btnELIMINAR;
    public javax.swing.JButton btnMOSTRAR_TODO;
    public javax.swing.JButton btnNUEVA_CITA;
    public javax.swing.JButton btnREGISTRAR_CITA;
    public javax.swing.JComboBox<String> cbxarea;
    public javax.swing.JComboBox<String> cbxareabuscar;
    public javax.swing.JComboBox<String> cbxcitaestado;
    public com.toedter.calendar.JDateChooser dchfechabuscar;
    public com.toedter.calendar.JDateChooser dchfechacita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTable tblCITAS;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtHora;
    public javax.swing.JTextField txtcitahora;
    public javax.swing.JTextField txtdetallescita;
    public javax.swing.JTextField txtdueñoapell;
    public javax.swing.JTextField txtdueñocell;
    public javax.swing.JTextField txtdueñodni;
    public javax.swing.JTextField txtdueñonombre;
    public javax.swing.JTextField txtmascostaid;
    public javax.swing.JTextField txtmascostanom;
    public javax.swing.JTextField txtmascostasex;
    public javax.swing.JTextField txtmascotaesp;
    // End of variables declaration//GEN-END:variables

}
