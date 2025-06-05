package controlador;

import DAO.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.*;
import modelo.*;
import Principal.*;
import formatos.*;

public class CtrlSeleccionarMascota implements ActionListener{

    SeleccionarMascota vista;
    DAOSeleccionarMascota crud;   
    Mascota masc;
    Propietario prop;
    
    public CtrlSeleccionarMascota(SeleccionarMascota sm){
        vista = sm;
        vista.btnSELECCIONAR.addActionListener(this);
        Cabecera.FormatoCabecera(vista.tblMASCOTA);
        sm.setTitle("SELECCIONAR MASCOTA");
        sm.setVisible(true);
        ActualizarForma();
    }

    void ActualizarForma(){
        crud = new DAOSeleccionarMascota();
        crud.MostrarMascota(vista.tblMASCOTA);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
 
        if( ae.getSource() == vista.btnSELECCIONAR){
            
            int fila = vista.tblMASCOTA.getSelectedRow();
            String id = vista.tblMASCOTA.getValueAt(fila, 0).toString();    
            
                Main.registroCita = new EmpRegistrarCita();
                Main.ctrlRC = new CtrlRegistrarCita(Main.registroCita);
                
                crud = new DAOSeleccionarMascota();
                
                masc = crud.CompletarCitaMascota(id);
                /*TRAYENDO MASCOTA*/
                Main.ctrlRC.vista.txtmascostaid.setText(masc.getIdmascota());
                Main.ctrlRC.vista.txtmascostanom.setText(masc.getNombrePaciente());
                Main.ctrlRC.vista.txtmascotaesp.setText(masc.getEspecie());
                Main.ctrlRC.vista.txtmascostasex.setText(masc.getSexo());
                
                /*---------------------------------------------------------------------*/
                
                prop = crud.CompletarCitaDueño(id);
                
                /*TRAYENDO PROPIETARIO*/
                Main.ctrlRC.vista.txtdueñodni.setText(prop.getDNI());
                Main.ctrlRC.vista.txtdueñonombre.setText(prop.getNombre());
                Main.ctrlRC.vista.txtdueñoapell.setText(prop.getApellido());
                Main.ctrlRC.vista.txtdueñocell.setText(prop.getCelular());
                
                Main.controlME.vista.dtkpContenedorEmpleado.add(Main.registroCita);
                vista.setVisible(false);
        }       
    }     
}
