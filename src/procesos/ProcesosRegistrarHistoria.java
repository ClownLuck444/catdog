package procesos;

import vista.*;
import modelo.*;

public class ProcesosRegistrarHistoria {

     public static void Presentacion(MedRegistrarHistoria mrh){
        mrh.setTitle("REGISTRAR HISTORIA CLINICA");
        mrh.setVisible(true);
    }
      public static Historia LeerHistoria(MedRegistrarHistoria mrh){
         
        Historia hc = new  Historia();
        
        hc.setID_mascota(mrh.txtid_mascota.getText());
        hc.setNombreMascosta(mrh.txtmascostanom.getText());
        hc.setSexo(mrh.txtmascostasex.getText());
        hc.setEspecie(mrh.txtmascotaesp.getText());
        hc.setDNI(mrh.txtdueñodni.getText());
        hc.setNombrePropietario(mrh.txtdueñonombre.getText());
        hc.setApellido(mrh.txtdueñoapell.getText());
        hc.setCelular(mrh.txtdueñocell.getText());
        hc.setID_historia(mrh.txtid_historia.getText());
        hc.setDetallecita(mrh.txtdetallecita.getText());
        hc.setDiagnostico(mrh.txadiagnostico.getText());
        hc.setTratamiento(mrh.txatratamiento.getText());
        
        return hc;
    }
      public static void LimpiarEntradas (MedRegistrarHistoria mrh){
         
        mrh.txtid_mascota.setText("");
        mrh.txtmascostanom.setText("");
        mrh.txtmascostasex.setText("");
        mrh.txtmascotaesp.setText("");
        mrh.txtdueñodni.setText("");
        mrh.txtdueñonombre.setText("");
        mrh.txtdueñoapell.setText("");
        mrh.txtdueñocell.setText("");
        mrh.txtid_historia.setText("");
        mrh.txtdetallecita.setText("");
        mrh.txadiagnostico.setText("");
        mrh.txatratamiento.setText("");
        
        mrh.txtid_historia.requestFocus();
    }   
}
