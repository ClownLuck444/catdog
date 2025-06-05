package controlador;

import java.awt.event.*;
import vista.*;

public class CtrlMasterLogin implements ActionListener {

    MasterLogin vista;
    Login log;
    CtrlLogin ctrlLog;
    MenuPaciente mp;
    CtrlMenuPaciente ctrlmp;

    public CtrlMasterLogin(MasterLogin master) {
        vista = master;
        vista.btnEMPLEADO.addActionListener(this);
        vista.btnMEDICO.addActionListener(this);
        vista.btnPACIENTE.addActionListener(this);
        master.setTitle("SELECCIÓN DE USUARIO");
        master.setLocationRelativeTo(null);
        master.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == vista.btnMEDICO) {
            
            log = new Login();
            ctrlLog = new CtrlLogin(log);
            ctrlLog.vista.setVisible(true);
            vista.setVisible(false);            
        }
        if (ae.getSource() == vista.btnEMPLEADO) {
            
            log = new Login();
            ctrlLog = new CtrlLogin(log);
            ctrlLog.vista.setVisible(true);
            vista.setVisible(false);
        }
        if (ae.getSource() == vista.btnPACIENTE) {
            
            mp = new MenuPaciente();
            ctrlmp = new CtrlMenuPaciente(mp);
            vista.setVisible(false);
        }
    }
}
