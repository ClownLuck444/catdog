package procesos;

import modelo.*;
import vista.*;
import formatos.*;

public class ProcesosRegistrarPaciente implements Constantes{
    
    public static void Presentacion(EmpRegistrarPaciente rp) {
        rp.setTitle("REGISTRAR PACIENTE");
        rp.setVisible(true);
    }
    
    public static Propietario LeerDueño(EmpRegistrarPaciente rp){
        
         Propietario propietario = new Propietario();
        
        propietario.setDNI(rp.txtpropietariodni.getText());
        propietario.setNombre(rp.txtpropietarionom.getText());
        propietario.setApellido(rp.txtpropietarioape.getText());
        propietario.setDireccion(rp.txtpropietariodir.getText());
        propietario.setCelular(rp.txtpropietariocel.getText());
        propietario.setCorreo(rp.txtpropietariocorr.getText());
        propietario.setID_Mascota(rp.txtidmascota.getText());

        return propietario;
    }
    
    public static Mascota LeerMascota(EmpRegistrarPaciente rp){
        
        Mascota mascota = new Mascota();
        
        mascota.setIdmascota(rp.txtidmascota.getText());
        mascota.setNombrePaciente(rp.txtpacientenombre.getText());
        mascota.setTamaño(rp.txtpacientetamaño.getText());
        mascota.setColor(rp.txtpacientecolor.getText());
        mascota.setEdad(rp.txtpacienteedad.getText());      
        mascota.setFechaNacimiento(FormatosDatos.FormatoTextoDate(rp.dchpacientenacimiento));
        mascota.setEspecie((String)rp.cbxpacienteespecie.getSelectedItem());
        mascota.setSexo((String)rp.cbxpacientesexo.getSelectedItem());
        mascota.setRaza(rp.txtpacienteraza.getText());
        mascota.setVacunas(rp.txtpacientevacunas.getText());

        return mascota;
    }
    
    public static void LimpiarCuadrosMascota(EmpRegistrarPaciente rp){
        
        rp.txtidmascota.setText("");
        //rp.txtdnidueño.setText("");
        rp.txtpacientenombre.setText("");
        rp.txtpacientetamaño.setText("");
        rp.txtpacientecolor.setText("");
        rp.txtpacienteedad.setText("");
        rp.dchpacientenacimiento.setCalendar(null);
        rp.cbxpacienteespecie.setSelectedIndex(0);
        rp.cbxpacientesexo.setSelectedIndex(0);
        rp.txtpacienteraza.setText("");
        rp.txtpacientevacunas.setText("");
        
        rp.txtpropietariodni.setText("");
        rp.txtpropietarionom.setText("");
        rp.txtpropietarioape.setText("");
        rp.txtpropietariodir.setText("");
        rp.txtpropietariocel.setText("");
        rp.txtpropietariocorr.setText("");
        
        rp.txtpacientenombre.requestFocus();
    }
       
    public static void BotonesBuscarActualizar(EmpRegistrarPaciente erp){
       erp.btnGUARDAR_PACIENTE.setEnabled(false);
    }
    
    public static void CompletarCombos(EmpRegistrarPaciente rp){
        
        rp.cbxpacienteespecie.removeAllItems();
        rp.cbxpacientesexo.removeAllItems();
        
        for(int i = 0 ; i < ESPECIE.length ; i++){
            rp.cbxpacienteespecie.addItem(ESPECIE[i]);
        }
        
        for(int i = 0 ; i < SEXO.length ; i++){
            rp.cbxpacientesexo.addItem(SEXO[i]);
        }      
    }   
}
