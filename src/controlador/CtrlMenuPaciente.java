package controlador;

import Principal.Main;
import formatos.CentrarForma;
import java.awt.event.*;
import javax.swing.JFrame;
import vista.*;

public class CtrlMenuPaciente implements ActionListener{

    MenuPaciente vista;
    
    public CtrlMenuPaciente(MenuPaciente mp){
       vista = mp;
       vista.mitemCONSULTAR_CITA.addActionListener(this);
       vista.mitemCONSULTAR_HISTORIA.addActionListener(this);
       mp.setExtendedState(JFrame.MAXIMIZED_BOTH);
       mp.setDefaultCloseOperation(mp.EXIT_ON_CLOSE);
       mp.setTitle("MENÚ PACIENTE");
       mp.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if( ae.getSource() == vista.mitemCONSULTAR_CITA ){
            
            Main.pcc = new PacConsultarCita();
            Main.ctrlPCC = new CtrlPacConsultarCita(Main.pcc);
            vista.dtkpContenedorCliente.removeAll();
            vista.dtkpContenedorCliente.updateUI();
            vista.dtkpContenedorCliente.add(Main.pcc);
            CentrarForma.CPanel(vista.dtkpContenedorCliente, Main.pcc);           
        }
        if( ae.getSource() == vista.mitemCONSULTAR_HISTORIA ){
            
            Main.pch = new PacConsultarHistoria();
            Main.ctrlPCH= new CtrlPacConsultarHistoria(Main.pch);
            vista.dtkpContenedorCliente.removeAll();
            vista.dtkpContenedorCliente.updateUI();
            vista.dtkpContenedorCliente.add(Main.pch);
            CentrarForma.CPanel3(vista.dtkpContenedorCliente, Main.pch);
        }
    }    
}
