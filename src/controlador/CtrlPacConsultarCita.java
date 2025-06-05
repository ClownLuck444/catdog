package controlador;

import java.awt.event.*;
import vista.*;
import DAO.*;
import formatos.*;

public class CtrlPacConsultarCita implements ActionListener {

    PacConsultarCita vista;
    DAOPacConsultarCita crud;
    
    public CtrlPacConsultarCita(PacConsultarCita pcc) {
        vista = pcc;
        vista.btnBUSCAR.addActionListener(this);
        Cabecera.FormatoCabecera(vista.tblCONSULTAR_CITA);
        pcc.setTitle("CONSULTAR CITA");        
        pcc.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if( ae.getSource() == vista.btnBUSCAR){
            
            crud = new DAOPacConsultarCita();
            String dni = vista.txtdni.getText();
            crud.BuscarDNI(vista.tblCONSULTAR_CITA, dni);
            ManejarTabla.CambiarTamañoColumnas(vista.tblCONSULTAR_CITA);
        }       
    } 
}
