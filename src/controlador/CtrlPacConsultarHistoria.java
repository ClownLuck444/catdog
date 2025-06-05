package controlador;

import java.awt.event.*;
import vista.*;
import DAO.*;
import modelo.*;

public class CtrlPacConsultarHistoria implements ActionListener {

    PacConsultarHistoria vista;
    DAOPacConsultarHistoria crud;
    Historia h;
    
    public CtrlPacConsultarHistoria(PacConsultarHistoria pch) {
        vista = pch;
        vista.btnBUSCAR.addActionListener(this);
        pch.setTitle("CONSULTAR HISTORIA");
        pch.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == vista.btnBUSCAR){
            
            String dni = vista.txtdni.getText();
            String nombre = vista.txtnombremascota.getText();
            
            crud = new DAOPacConsultarHistoria();
            h = crud.MostrarHostiria(dni, nombre);
            
            vista.txaAREA_HISTORIA.setText("\n********************** DATOS DEL PROPIETARIO **********************\n"+
                                     "\n\t\tDNI                     : "+h.getDNI()+
                                     "\n\t\tNOMBRE DEL PROPIETARIO  : "+h.getNombrePropietario()+
                                     "\n\t\tAPELLIDO                : "+h.getApellido()+
                                     "\n\t\tCELULAR                 : "+h.getCelular()+
                                     "\n\n*********************** DATOS DEL PACIENTE ***********************\n"+
                                     "\n\t\tID MASCOTA              : "+h.getID_mascota()+                                    
                                     "\n\t\tNOMBRE DEL PACIENTE     : "+h.getNombreMascosta()+
                                     "\n\t\tESPECIE                 : "+h.getEspecie()+
                                     "\n\t\tSEXO                    : "+h.getSexo()+
                                     "\n\n******************** HISTORIAL CONSULTA "+h.getID_historia()+" ********************\n"+      
                                     "\n\t-DETALLE DE CITA: "+"\n"+
                                     "\n\t"+h.getDetallecita()+"\n\n"+
                                     "\n\t-DIAGNOSTICO: "+"\n"+
                                     "\n\t"+h.getDiagnostico()+"\n\n"+
                                     "\n\t-TRATAMIENTO: "+"\n"+
                                     "\n\t"+h.getTratamiento()+"\n\n");                     
        }       
    }
}
