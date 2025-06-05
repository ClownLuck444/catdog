package controlador;

import vista.*;
import modelo.*;
import DAO.*;
import Principal.*;
import formatos.*;
import java.awt.event.*;
import java.text.*;
import java.util.Date;
import javax.swing.*;
import procesos.*;

public class CtrlRegistrarCita extends MouseAdapter implements ActionListener,Constantes{

    EmpRegistrarCita vista;
    DAOEmpRegistrarCita crud;
    Cita cita;
    
    public CtrlRegistrarCita(EmpRegistrarCita erc){
        vista = erc;
        vista.btnBUSCAR_PACIENTES.addActionListener(this);
        vista.btnREGISTRAR_CITA.addActionListener(this);
        vista.tblCITAS.addMouseListener(this);
        vista.btnNUEVA_CITA.addActionListener(this);
        vista.btnACTUALIZAR.addActionListener(this);
        vista.btnELIMINAR.addActionListener(this);
        vista.btnBUSCAR.addActionListener(this);
        vista.btnMOSTRAR_TODO.addActionListener(this);
        Cabecera.FormatoCabecera(vista.tblCITAS);      
        ProcesosRegistrarCita.Presentacion(erc);
        ProcesosRegistrarCita.FechaActual(erc);
        ProcesosRegistrarCita.HoraTiempoReal(erc);
        ProcesosRegistrarCita.CompletarCombos(erc);
        ActualizarForma();
    }

    void ActualizarForma(){
        crud = new DAOEmpRegistrarCita();
        ProcesosRegistrarCita.LimpiarEntradas(vista);    
        crud.MostrarMascota(vista.tblCITAS);
        ManejarTabla.CambiarTamañoColumnas(vista.tblCITAS);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if( ae.getSource() == vista.btnBUSCAR_PACIENTES){
            
            Main.selecionarM = new SeleccionarMascota();
            Main.ctrlSM = new CtrlSeleccionarMascota(Main.selecionarM);          
            Main.ctrlSM.vista.setDefaultCloseOperation(JInternalFrame.HEIGHT);
            Main.controlME.vista.dtkpContenedorEmpleado.add(Main.selecionarM);
            CentrarForma.CPanel(Main.controlME.vista.dtkpContenedorEmpleado,Main.selecionarM);
            vista.setVisible(false);
        }
        if( ae.getSource() == vista.btnREGISTRAR_CITA){
            
            cita = ProcesosRegistrarCita.LeerCita(vista);
            crud = new DAOEmpRegistrarCita();
            crud.InsertarPropietario(cita);
            ActualizarForma();                       
        }
        if( ae.getSource() == vista.btnNUEVA_CITA ){
            
            ProcesosRegistrarCita.LimpiarEntradas(vista);
            vista.btnREGISTRAR_CITA.setEnabled(true);
        }
        if( ae.getSource() == vista.btnACTUALIZAR){
            
            cita = ProcesosRegistrarCita.LeerCita(vista);           
            crud = new DAOEmpRegistrarCita();
            crud.ActualizarCita(cita);
            vista.btnREGISTRAR_CITA.setEnabled(true);
            ActualizarForma();
        }
        if( ae.getSource() == vista.btnELIMINAR){
            
            int fila = vista.tblCITAS.getSelectedRow();
            String id = vista.tblCITAS.getValueAt(fila, 5).toString();
            
            crud = new DAOEmpRegistrarCita();
            crud.EliminarCita(id);
            vista.btnREGISTRAR_CITA.setEnabled(true);
            ActualizarForma();
        }
        if( ae.getSource() == vista.btnBUSCAR){
            
            crud = new DAOEmpRegistrarCita();
            String area = vista.cbxareabuscar.getSelectedItem().toString();
            String fecha = FormatosDatos.FormatoTextoDate(vista.dchfechabuscar);
            crud.FiltrarXAreaFecha(vista.tblCITAS,area,fecha);           
        }
        if( ae.getSource() == vista.btnMOSTRAR_TODO){
            
            ActualizarForma();
        }
    }

    @Override
    public void mouseClicked(MouseEvent me){
        
        if( me.getSource() == vista.tblCITAS){
            
            int fila = vista.tblCITAS.getSelectedRow();
            String id = vista.tblCITAS.getValueAt(fila, 5).toString();
            
            crud = new DAOEmpRegistrarCita();
            cita = crud.CompletarCuadros(id);
            
            vista.txtdueñodni.setText(cita.getDNI());
            vista.txtdueñonombre.setText(cita.getNombrePropietario());
            vista.txtdueñoapell.setText(cita.getApellido());
            vista.txtdueñocell.setText(cita.getCelular());
            vista.txtmascostaid.setText(cita.getID_mascota());
            vista.txtmascostanom.setText(cita.getNombreMascosta());
            vista.txtmascotaesp.setText(cita.getEspecie());
            vista.txtmascostasex.setText(cita.getSexo());
            
            for(int i = 0 ; i < AREA.length ; i++){
                if(cita.getAreacita().equals(AREA[i])){
                vista.cbxarea.setSelectedIndex(i);
                }
            }

            try {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaDate = formato.parse(cita.getFechaCita());
                vista.dchfechacita.setDate(fechaDate);
            }catch(ParseException e) {}
            
            vista.txtcitahora.setText(cita.getHoraCita());
            
            for(int i = 0 ; i < ESTADO.length ; i++){
                if(cita.getEstadoCita().equals(ESTADO[i])){
                vista.cbxcitaestado.setSelectedIndex(i);
                }
            }
            
            vista.txtdetallescita.setText(cita.getDetalleCita());
            
            /*BLOQUEAR BOTON DE GUARDAR*/
            vista.btnREGISTRAR_CITA.setEnabled(false);
        }
    }
}
