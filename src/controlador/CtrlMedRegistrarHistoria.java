package controlador;

import procesos.*;
import DAO.*;
import Principal.*;
import formatos.Cabecera;
import formatos.ManejarTabla;
import java.awt.event.*;
import javax.swing.JInternalFrame;
import modelo.*;
import vista.*;

public class CtrlMedRegistrarHistoria extends MouseAdapter implements ActionListener {
      
    MedRegistrarHistoria vista;
    Historia hc;
    DAOMedRegistrarHistoria crud;
    
    public CtrlMedRegistrarHistoria(MedRegistrarHistoria mrh) {
        vista=mrh;
        vista.btnBUSCAR_PACIENTE.addActionListener(this);
        vista.btnREGISTRAR_HISTORIA.addActionListener(this);
        vista.btnNUEVA_HISTORIA.addActionListener(this);
        vista.tblHISTORIA.addMouseListener(this);
        vista.btnACTUALIZAR.addActionListener(this);
        vista.btnELIMINAR.addActionListener(this);
        Cabecera.FormatoCabecera(vista.tblHISTORIA);
        ProcesosRegistrarHistoria.Presentacion(mrh);
        ActualizarForma();
    }
    void ActualizarForma(){
        crud = new DAOMedRegistrarHistoria();
        ProcesosRegistrarHistoria.LimpiarEntradas(vista);
        crud.MostrarHistoria(vista.tblHISTORIA);
        ManejarTabla.CambiarTamañoColumnas(vista.tblHISTORIA);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if( e.getSource() == vista.btnBUSCAR_PACIENTE ){
            
            Main.mcc = new MedConsultarCitas();
            Main.ctrlMCC = new CtrlMedConsultarCitas(Main.mcc);
            Main.ctrlMCC.vista.setDefaultCloseOperation(JInternalFrame.HEIGHT);
            Main.ctrlMM.vista.dtkpContenedorMedico.add(Main.mcc);
            Main.ctrlMCC.vista.btnSELECCIONAR_CITA.setEnabled(true);
            vista.setVisible(false);
        }
        if( e.getSource() == vista.btnREGISTRAR_HISTORIA ){
            
            hc = ProcesosRegistrarHistoria.LeerHistoria(vista);
            crud = new DAOMedRegistrarHistoria();
            crud.InsertarConsulta(hc);
            ActualizarForma();           
        }
        if( e.getSource() == vista.btnNUEVA_HISTORIA ){
            
            ProcesosRegistrarHistoria.LimpiarEntradas(vista);
            vista.btnREGISTRAR_HISTORIA.setEnabled(true);
        }
        if( e.getSource() == vista.btnACTUALIZAR ){
            
            hc = ProcesosRegistrarHistoria.LeerHistoria(vista);
            crud = new DAOMedRegistrarHistoria();
            crud.Actualizar(hc);
            vista.btnREGISTRAR_HISTORIA.setEnabled(true);
            vista.txaRESUMEN.setText("");
            ActualizarForma();  
        }
        if( e.getSource() == vista.btnELIMINAR ){
            
            int fila = vista.tblHISTORIA.getSelectedRow();
            String id = vista.tblHISTORIA.getValueAt(fila, 8).toString();
            
            crud = new DAOMedRegistrarHistoria();
            crud.Eliminar(id);
            vista.btnREGISTRAR_HISTORIA.setEnabled(true); 
            ActualizarForma();
        }  
    }

    public void mouseClicked(MouseEvent me) {

        if (me.getSource() == vista.tblHISTORIA ) {

            int fila = vista.tblHISTORIA.getSelectedRow();
            String ID = vista.tblHISTORIA.getValueAt(fila, 8).toString();

            crud = new DAOMedRegistrarHistoria();
            hc = crud.CompletarCuadros(ID);

            vista.txtdueñodni.setText(hc.getDNI());
            vista.txtdueñonombre.setText(hc.getNombrePropietario());
            vista.txtdueñoapell.setText(hc.getApellido());
            vista.txtdueñocell.setText(hc.getCelular());
            vista.txtid_mascota.setText(hc.getID_mascota());
            vista.txtmascostanom.setText(hc.getNombreMascosta());
            vista.txtmascotaesp.setText(hc.getEspecie());
            vista.txtmascostasex.setText(hc.getSexo());
            vista.txtid_historia.setText(hc.getID_historia());
            vista.txtdetallecita.setText(hc.getDetallecita());
            vista.txadiagnostico.setText(hc.getDiagnostico());
            vista.txatratamiento.setText(hc.getTratamiento());

            vista.txaRESUMEN.setText("---------------- HISTORIAL CLINICO DEL PACIENTE "+hc.getNombreMascosta()+" ----------------\n"+
                                     "\n\tDNI                      : "+hc.getDNI()+
                                     "\n\tNOMBRE DEL PROPIETARIO   : "+hc.getNombrePropietario()+
                                     "\n\tAPELLIDO                 : "+hc.getApellido()+
                                     "\n\tCELULAR                  : "+hc.getCelular()+"\n"+
                                     "\n\tID MASCOTA               : "+hc.getID_mascota()+
                                     "\n\tNOMBRE DEL PACIENTE      : "+hc.getNombreMascosta()+
                                     "\n\tESPECIE                  : "+hc.getEspecie()+
                                     "\n\tSEXO                     : "+hc.getSexo()+"\n"+
                                     "\n\tID HISTORIA              : "+hc.getID_historia()+
                                     "\n\tDETALLE DE CITA          : "+hc.getDetallecita()+
                                     "\n\tDIAGNOSTICO              : "+hc.getDiagnostico()+
                                     "\n\tTRATAMIENTO              : "+hc.getTratamiento());
            
            vista.btnREGISTRAR_HISTORIA.setEnabled(false);
        }
    }
}
     

