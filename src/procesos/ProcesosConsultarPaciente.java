package procesos;

import java.awt.Color;
import vista.*;

public class ProcesosConsultarPaciente {

    public static void Presentacion(EmpConsultar emp) {
        emp.setTitle("CONSULTAR");
        emp.setVisible(true);
    }

    public static void BloquearMascota(EmpConsultar emp){
       emp.txtnombremascota.setEditable(false);
       emp.txtnombremascota.setBackground(new Color(188,151,77));
       emp.btnBUSCAR_MASCOTA.setEnabled(false);
    }
    public static void ActivarMascota(EmpConsultar emp){
       emp.txtnombremascota.setEditable(true);
       emp.txtnombremascota.setBackground(new Color(255,255,255));
       emp.btnBUSCAR_MASCOTA.setEnabled(true);
    }
    
    public static void BloquearPropietario(EmpConsultar emp){
       emp.txtDNIdueño.setEditable(false);
       emp.txtDNIdueño.setBackground(new Color(188,151,77));
       emp.btnBUSCAR_DUEÑO.setEnabled(false);
    }
    public static void ActivarPropietario(EmpConsultar emp){
       emp.txtDNIdueño.setEditable(true);
       emp.txtDNIdueño.setBackground(new Color(255,255,255));
       emp.btnBUSCAR_DUEÑO.setEnabled(true);
    }
    
    public static void ActivarActualizarDueño(EmpRegistrarPaciente erp){       
        erp.txtpropietariodni.setEditable(true);
        erp.txtpropietarionom.setEditable(true);
        erp.txtpropietarioape.setEditable(true);
        erp.txtpropietariodir.setEditable(true);
        erp.txtpropietariocel.setEditable(true);
        erp.txtpropietariocorr.setEditable(true);
    }
    
}
