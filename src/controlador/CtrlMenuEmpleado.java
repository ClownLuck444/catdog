package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vista.*;
import Principal.*;
import formatos.*;

public class CtrlMenuEmpleado implements ActionListener{

    MenuEmpleado vista;
    
    public CtrlMenuEmpleado(MenuEmpleado me){
        vista = me;
        vista.mitemREGISTRAR_PACIENTE.addActionListener(this);
        vista.mitemCONSULTAR_PACIENTE.addActionListener(this);
        vista.mitemREGISTRAR_CITA.addActionListener(this);
        me.setExtendedState(JFrame.MAXIMIZED_BOTH);
        me.setDefaultCloseOperation(me.EXIT_ON_CLOSE);
        me.setVisible(true);
        me.setTitle("MENÚ EMPLEADO");  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
      if(e.getSource()== vista.mitemREGISTRAR_PACIENTE){
          
          Main.registroPac = new EmpRegistrarPaciente();
          Main.ctrlRP = new CtrlRegistroPaciente(Main.registroPac);
          vista.dtkpContenedorEmpleado.removeAll();
          vista.dtkpContenedorEmpleado.updateUI();
          vista.dtkpContenedorEmpleado.add(Main.registroPac);          
          CentrarForma.CPanel(vista.dtkpContenedorEmpleado,Main.registroPac);
      }     
      if(e.getSource()== vista.mitemCONSULTAR_PACIENTE){
          
          Main.consulta = new EmpConsultar();
          Main.ctrlC =  new CtrlEmpConsultar(Main.consulta);
          vista.dtkpContenedorEmpleado.removeAll();
          vista.dtkpContenedorEmpleado.updateUI();
          vista.dtkpContenedorEmpleado.add(Main.consulta);
          CentrarForma.CPanel(vista.dtkpContenedorEmpleado,Main.consulta);
      }
      if(e.getSource()== vista.mitemREGISTRAR_CITA){
          
          Main.registroCita = new EmpRegistrarCita();
          Main.ctrlRC =  new CtrlRegistrarCita(Main.registroCita);
          vista.dtkpContenedorEmpleado.removeAll();
          vista.dtkpContenedorEmpleado.updateUI();
          vista.dtkpContenedorEmpleado.add(Main.registroCita);
          CentrarForma.CPanel2(vista.dtkpContenedorEmpleado,Main.registroCita);
        }
    }
}
