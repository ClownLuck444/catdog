package procesos;

import formatos.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import modelo.*;
import vista.*;

public class ProcesosRegistrarCita implements Constantes{

    public static void Presentacion(EmpRegistrarCita erc){
        erc.setTitle("REGISTRAR CITA");
        erc.setVisible(true);
    }
    
    public static Cita LeerCita(EmpRegistrarCita erc){
         
        Cita c = new Cita();
        c.setID_mascota(erc.txtmascostaid.getText());
        c.setNombreMascosta(erc.txtmascostanom.getText());
        c.setSexo(erc.txtmascostasex.getText());
        c.setEspecie(erc.txtmascotaesp.getText());
        c.setDNI(erc.txtdueñodni.getText());
        c.setNombrePropietario(erc.txtdueñonombre.getText());
        c.setApellido(erc.txtdueñoapell.getText());
        c.setCelular(erc.txtdueñocell.getText());
        c.setAreacita(erc.cbxarea.getSelectedItem().toString());
        c.setFechaCita(FormatosDatos.FormatoTextoDate(erc.dchfechacita));
        c.setHoraCita(erc.txtcitahora.getText());
        c.setEstadoCita(erc.cbxcitaestado.getSelectedItem().toString());
        c.setDetalleCita(erc.txtdetallescita.getText());
        
        return c;
    }
    
    public static void LimpiarEntradas (EmpRegistrarCita erc){
         
        erc.txtmascostaid.setText("");
        erc.txtmascostanom.setText("");
        erc.txtmascostasex.setText("");
        erc.txtmascotaesp.setText("");
        erc.txtdueñodni.setText("");
        erc.txtdueñonombre.setText("");
        erc.txtdueñoapell.setText("");
        erc.txtdueñocell.setText("");
        erc.cbxarea.setSelectedIndex(0);
        erc.dchfechacita.setCalendar(null);
        erc.txtcitahora.setText("");
        erc.cbxcitaestado.setSelectedIndex(0);
        erc.txtdetallescita.setText("");
    }
    
    public static void HoraTiempoReal(EmpRegistrarCita erc) {

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                        erc.txtHora.setText(formateador.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        
        Thread hilo = new Thread(runnable);
        hilo.start();
    }

    public static void FechaActual(EmpRegistrarCita erc) {
        
        DateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        String date = dateFormat.format(new Date());
        erc.txtFecha.setText(date);
    }
  
    public static void CompletarCombos(EmpRegistrarCita erc){
        
        erc.cbxarea.removeAllItems();
        erc.cbxcitaestado.removeAllItems();
        erc.cbxareabuscar.removeAllItems();
        
        for(int i = 0 ; i < AREA.length ; i++){
            erc.cbxarea.addItem(AREA[i]);
        }
        
        for(int i = 0 ; i < ESTADO.length ; i++){
            erc.cbxcitaestado.addItem(ESTADO[i]);
        }   
        
        for(int i = 0 ; i < AREA.length ; i++){
            erc.cbxareabuscar.addItem(AREA[i]);
        }
    }
}
