package controlador;

import java.awt.event.*;
import modelo.*;
import procesos.*;
import vista.*;
import DAO.*;
import formatos.*;
import java.awt.Color;
import java.text.*;
import java.util.Date;
import javax.swing.*;

public class CtrlRegistroPaciente implements ActionListener,Constantes{
    
    EmpConsultar ec;
    CtrlEmpConsultar emp;
    DAOEmpConsultar daoec;   
    EmpRegistrarPaciente vista;
    DAOEmpRegistrarPaciente crud;
    Mascota masc;
    Propietario dueño;
    
    public CtrlRegistroPaciente(EmpRegistrarPaciente erp){
        vista = erp;
        vista.btnGUARDAR_PACIENTE.addActionListener(this);
        vista.btnACTUALIZAR.addActionListener(this);
        vista.btnBUSCAR.addActionListener(this);
        ProcesosRegistrarPaciente.CompletarCombos(erp);
        vista.cbxpacienteespecie.addActionListener(this);
        vista.cbxpacientesexo.addActionListener(this);
        ProcesosRegistrarPaciente.Presentacion(erp);
        BloquearBotones();
    }

    void BloquearBotones(){
        vista.btnACTUALIZAR.setEnabled(false);
        vista.btnBUSCAR.setEnabled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista.btnGUARDAR_PACIENTE){
         
            masc = ProcesosRegistrarPaciente.LeerMascota(vista);
            dueño = ProcesosRegistrarPaciente.LeerDueño(vista);
            crud = new DAOEmpRegistrarPaciente();
            crud.InsertarMascotas(masc);
            crud.InsertarPropietario(dueño);
            ProcesosRegistrarPaciente.LimpiarCuadrosMascota(vista);          
        }
        if(ae.getSource() == vista.btnBUSCAR){

                String id = vista.txtidmascota.getText();
                crud = new DAOEmpRegistrarPaciente();
                
                masc = crud.CompletarCuadrosMascota(id);
                /*TRAYENDO MASCOTA*/
                vista.txtpacientenombre.setText(masc.getNombrePaciente());
                vista.txtpacientetamaño.setText(masc.getTamaño());
                vista.txtpacientecolor.setText(masc.getColor());
                vista.txtpacienteedad.setText(masc.getEdad());
                
                try {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaDate = formato.parse(masc.getFechaNacimiento());
                vista.dchpacientenacimiento.setDate(fechaDate);
                } catch (ParseException e) {}

                for(int i = 0 ; i < ESPECIE.length ; i++){
                    if(masc.getEspecie().equals(ESPECIE[i])){
                        vista.cbxpacienteespecie.setSelectedIndex(i);
                    }
                }
                
                for(int i = 0 ; i < SEXO.length ; i++){
                    if(masc.getSexo().equals(SEXO[i])){
                        vista.cbxpacientesexo.setSelectedIndex(i);
                    }
                }
                
                vista.txtpacienteraza.setText(masc.getRaza());
                vista.txtpacientevacunas.setText(masc.getVacunas());
                /*---------------------------------------------------------------------*/
                
                dueño = crud.CompletarCuadrosDueño(id);
                
                /*TRAYENDO PROPIETARIO*/
                vista.txtpropietariodni.setText(dueño.getDNI());
                vista.txtpropietarionom.setText(dueño.getNombre());
                vista.txtpropietarioape.setText(dueño.getApellido());
                vista.txtpropietariodir.setText(dueño.getDireccion());
                vista.txtpropietariocel.setText(dueño.getCelular());
                vista.txtpropietariocorr.setText(dueño.getCorreo());              
        }
        if(ae.getSource() == vista.btnACTUALIZAR){
            
            masc = ProcesosRegistrarPaciente.LeerMascota(vista);
            dueño = ProcesosRegistrarPaciente.LeerDueño(vista);
            
            masc.setIdmascota(vista.txtidmascota.getText());
            dueño.setID_Mascota(vista.txtidmascota.getText());
            
            crud = new DAOEmpRegistrarPaciente();
            
            crud.ActualizarMascota(masc);           
            crud.ActualizarPropietario(dueño);
            
            vista.setVisible(false);
            Mensajeria.Message("Datos actualizados correctamente...");
        }
        if(ae.getSource() == vista.cbxpacienteespecie){
            
            String tipo = (String) vista.cbxpacienteespecie.getSelectedItem();
            
            for(int i = 0 ; i < ESPECIE.length ; i++){
                if(tipo.equals(ESPECIE[i])){
                    vista.lblANIMAL.setIcon(new ImageIcon("D:\\4TO CICLO\\VETERINARIA_CATDOG\\src\\Iconos\\"+ESPECIE[i]+".png"));
                }    
            }
        }
        if(ae.getSource() == vista.cbxpacientesexo){
          
            String sexo = (String) vista.cbxpacientesexo.getSelectedItem();
            
            if(sexo.equals(SEXO[0])){
                vista.pnlCOLOR_SEXO.setBackground(new Color(54,98,190));
            }else{
                vista.pnlCOLOR_SEXO.setBackground(new Color(179,97,178));
            }            
        }       
    }/*LLAVE FIN DEL METODO ACTIONLISTENER*/
}/*LLAVE FIN DE LA CLASE*/
