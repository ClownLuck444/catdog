package DAO;

import formatos.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class DAOPacConsultarCita extends ConectorBD{

    String [] cabezaCita = {"HORA CITA","CITA ESTADO","AREA CITA","FECHA CITA","CITA DETALLES","ID MASCOTA","NOMBRE MASCOTA","ESPECIE","SEXO","DNI","NOMBRE DUEÑO","APELLIDO","CELULAR"};
    DefaultTableModel modeloCita = new DefaultTableModel(null,cabezaCita);
    
    public void BuscarDNI(JTable tabla,String dni){
        
        tabla.setModel(modeloCita);
        Cita cita = new Cita();
        
        try{
            rs = st.executeQuery("SELECT CitaHora,CitaEstado,CitaArea,CitaFecha,CitaDetalles,ID_Mascota,MascotaNombre,MascotaEspecie,MascotaSexo,DueñoDNI,DueñoNombre,DueñoApellido,DueñoCelular from cita where DueñoDNI='"+dni+"';");
            
            while(rs.next()){
                cita.setHoraCita(rs.getString(1));
                cita.setEstadoCita(rs.getString(2));
                cita.setAreacita(rs.getString(3));
                cita.setFechaCita(rs.getString(4));
                cita.setDetalleCita(rs.getString(5));
                cita.setID_mascota(rs.getString(6));
                cita.setNombreMascosta(rs.getString(7));
                cita.setEspecie(rs.getString(8));
                cita.setSexo(rs.getString(9));
                cita.setDNI(rs.getString(10));
                cita.setNombrePropietario(rs.getString(11));
                cita.setApellido(rs.getString(12));
                cita.setCelular(rs.getString(13));

                modeloCita.addRow(cita.RegistroCita());
            } 
            conexion.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la busqueda por dni en la cita..."+e.getMessage());
        }  
    }
    
}
