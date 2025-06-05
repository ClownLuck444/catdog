package controlador;

import vista.*;
import procesos.*;
import DAO.*;
import formatos.*;
import modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Principal.*;
import javax.swing.JInternalFrame;


public class CtrlEmpConsultar extends MouseAdapter implements ActionListener{

    EmpRegistrarPaciente erp;
    EmpConsultar vista;
    CtrlRegistroPaciente ctrlpa;
    DAOEmpConsultar crud;
    Mascota masc;
    Propietario prop;
    
    public CtrlEmpConsultar(EmpConsultar emp){
        vista = emp;
        vista.rbtndueño.addActionListener(this);
        vista.rbtnmasco.addActionListener(this);
        vista.btnBUSCAR_MASCOTA.addActionListener(this);
        vista.btnBUSCAR_DUEÑO.addActionListener(this);
        vista.lblACTUALIZAR.addMouseListener(this);
        vista.lblELIMINAR.addMouseListener(this);
        vista.btnREFRESCAR.addActionListener(this);
        crud = new DAOEmpConsultar();
        crud.MostrarMascota(vista.tblMASCOTAS_DUEÑOS);
        Cabecera.FormatoCabecera(vista.tblMASCOTAS_DUEÑOS);
        ProcesosConsultarPaciente.BloquearPropietario(vista);
        ProcesosConsultarPaciente.Presentacion(emp);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if( ae.getSource() == vista.rbtnmasco){
            crud = new DAOEmpConsultar();
            crud.MostrarMascota(vista.tblMASCOTAS_DUEÑOS);
            ProcesosConsultarPaciente.BloquearPropietario(vista);
            ProcesosConsultarPaciente.ActivarMascota(vista);
        }
        if(ae.getSource() == vista.rbtndueño){
            crud = new DAOEmpConsultar();
            crud.MostrarDueño(vista.tblMASCOTAS_DUEÑOS);
            ProcesosConsultarPaciente.BloquearMascota(vista);
            ProcesosConsultarPaciente.ActivarPropietario(vista);
        }
        if(ae.getSource() == vista.btnBUSCAR_MASCOTA){
            
            crud = new DAOEmpConsultar();
            String nombre = vista.txtnombremascota.getText();
            crud.FiltrarXNombreMascota(vista.tblMASCOTAS_DUEÑOS,nombre);
            vista.txtnombremascota.setText("");
            vista.btngrpEleccion.clearSelection();
        }
        if(ae.getSource() == vista.btnBUSCAR_DUEÑO){
            
            crud = new DAOEmpConsultar();
            String dni = vista.txtDNIdueño.getText();
            crud.FiltrarXDNIPropietario(vista.tblMASCOTAS_DUEÑOS,dni);
            vista.txtDNIdueño.setText("");
            vista.btngrpEleccion.clearSelection();
        }
        if( ae.getSource() == vista.btnREFRESCAR){
            
            crud = new DAOEmpConsultar();
            
            if(vista.rbtnmasco.isSelected()){
                crud.MostrarMascota(vista.tblMASCOTAS_DUEÑOS);
            }else{
                 crud.MostrarDueño(vista.tblMASCOTAS_DUEÑOS);
            }           
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        if(me.getSource() == vista.lblACTUALIZAR){

            Main.registroPac = new EmpRegistrarPaciente();
            Main.ctrlRP = new CtrlRegistroPaciente(Main.registroPac);
            Main.ctrlRP.vista.setDefaultCloseOperation(JInternalFrame.HEIGHT);           
            Main.controlME.vista.dtkpContenedorEmpleado.add(Main.registroPac);
            CentrarForma.CPanel(Main.controlME.vista.dtkpContenedorEmpleado,Main.registroPac);
            /**/
            Main.ctrlRP.vista.btnBUSCAR.setEnabled(true);
            Main.ctrlRP.vista.btnACTUALIZAR.setEnabled(true);
            ProcesosRegistrarPaciente.BotonesBuscarActualizar(Main.registroPac);         
        }
        if(me.getSource() == vista.lblELIMINAR){
         
            String IDMascota = Mensajeria.Input("Introduzca ID Mascota que desea eliminar...");
            crud = new DAOEmpConsultar();
            crud.EliminarPaciente(IDMascota);
            crud.EliminarPropietario(IDMascota);
            if(vista.rbtnmasco.isSelected()){
                crud.MostrarMascota(vista.tblMASCOTAS_DUEÑOS);
            }else{
                 crud.MostrarDueño(vista.tblMASCOTAS_DUEÑOS);
            }           
        }           
    }
}
