package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.*;
import DAO.*;
import Principal.*;
import formatos.*;
import modelo.*;

public class CtrlMedConsultarCitas implements ActionListener,Constantes{
    
    MedConsultarCitas vista;
    DAOMedConsultarCitas crud;
    Cita cita;
    
    public CtrlMedConsultarCitas(MedConsultarCitas mcc){
        vista = mcc;
        vista.btnBUSCAR_FECHA.addActionListener(this);
        vista.btnSELECCIONAR_CITA.addActionListener(this);
        Cabecera.FormatoCabecera(vista.tblCITAS);
        vista.setTitle("CONSULTAR CITAS");
        completarCombo();
        vista.setVisible(true);
    }

    void completarCombo(){
        
        vista.cbxarea.removeAllItems();
        
        for(int i = 0 ; i < AREA.length ; i++){
            vista.cbxarea.addItem(AREA[i]);
        }
    }
       
    @Override
    public void actionPerformed(ActionEvent ae) {

        if( ae.getSource() == vista.btnBUSCAR_FECHA ){
         
            crud = new DAOMedConsultarCitas();
            String area = vista.cbxarea.getSelectedItem().toString();
            String fecha = FormatosDatos.FormatoTextoDate(vista.dchbuscarfechacita);
            crud.FiltrarXAreaFecha(vista.tblCITAS,area,fecha);
            ManejarTabla.CambiarTamañoColumnas(vista.tblCITAS);
        }
        
        if( ae.getSource() == vista.btnSELECCIONAR_CITA ){
            
            int fila = vista.tblCITAS.getSelectedRow();
            String id = vista.tblCITAS.getValueAt(fila, 5).toString();    
            
                Main.mrh = new MedRegistrarHistoria();
                Main.ctrlRH = new CtrlMedRegistrarHistoria(Main.mrh);
                
                crud = new DAOMedConsultarCitas();
                
                cita = crud.CompletarCuadros(id);
                
                /*TRAYENDO MASCOTA*/
                Main.ctrlRH.vista.txtid_mascota.setText(cita.getID_mascota());
                Main.ctrlRH.vista.txtmascostanom.setText(cita.getNombreMascosta());
                Main.ctrlRH.vista.txtmascotaesp.setText(cita.getEspecie());
                Main.ctrlRH.vista.txtmascostasex.setText(cita.getSexo());
                
                /*TRAYENDO PROPIETARIO*/
                Main.ctrlRH.vista.txtdueñodni.setText(cita.getDNI());
                Main.ctrlRH.vista.txtdueñonombre.setText(cita.getNombrePropietario());
                Main.ctrlRH.vista.txtdueñoapell.setText(cita.getApellido());
                Main.ctrlRH.vista.txtdueñocell.setText(cita.getCelular());
                
                Main.ctrlRH.vista.txtdetallecita.setText(cita.getDetalleCita());
                
                Main.ctrlMM.vista.dtkpContenedorMedico.add(Main.mrh);
                vista.setVisible(false);            
        }
    }   
}
