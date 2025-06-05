package DAO;

import formatos.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class DAOEmpRegistrarCita extends ConectorBD{

    String [] cabezaCita = {"HORA CITA","CITA ESTADO","TIPO CITA","FECHA CITA","CITA DETALLES","ID MASCOTA","NOMBRE MASCOTA","ESPECIE","SEXO","DNI","NOMBRE DUEÑO","APELLIDO","CELULAR"};
    DefaultTableModel modeloCita = new DefaultTableModel(null,cabezaCita);
    
    public void InsertarPropietario(Cita cita){
        
        try{
            ps = conexion.prepareStatement("INSERT INTO cita (CitaHora,CitaEstado,CitaArea,CitaFecha,CitaDetalles,ID_Mascota,MascotaNombre,MascotaEspecie,MascotaSexo,DueñoDNI,DueñoNombre,DueñoApellido,DueñoCelular) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
            ps.setString(1, cita.getHoraCita());
            ps.setString(2, cita.getEstadoCita());
            ps.setString(3, cita.getAreacita());
            ps.setString(4, cita.getFechaCita());
            ps.setString(5, cita.getDetalleCita());
            ps.setString(6, cita.getID_mascota());
            ps.setString(7, cita.getNombreMascosta());
            ps.setString(8, cita.getEspecie());
            ps.setString(9, cita.getSexo());
            ps.setString(10, cita.getDNI());
            ps.setString(11, cita.getNombrePropietario());
            ps.setString(12, cita.getApellido());
            ps.setString(13, cita.getCelular());
            ps.executeUpdate();
            Mensajeria.Message("¡Datos insertados correctamente!");
            conexion.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR no se puede insertar propietario... "+e.getMessage());
        }  
    }
    
    public void MostrarMascota(JTable tabla){
        
        tabla.setModel(modeloCita);
        Cita cita = new Cita();
        
        try{
            rs = st.executeQuery("SELECT CitaHora,CitaEstado,CitaArea,CitaFecha,CitaDetalles,ID_Mascota,MascotaNombre,MascotaEspecie,MascotaSexo,DueñoDNI,DueñoNombre,DueñoApellido,DueñoCelular from cita");
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
            Mensajeria.Message("ERROR en la conexion con la base de datos..."+e.getMessage());
        } 
    }
    
    public Cita CompletarCuadros(String ID){
        
        Cita cita = null;    
        try{
            rs = st.executeQuery("SELECT CitaHora,CitaEstado,CitaArea,CitaFecha,CitaDetalles,ID_Mascota,MascotaNombre,MascotaEspecie,MascotaSexo,DueñoDNI,DueñoNombre,DueñoApellido,DueñoCelular from cita where ID_Mascota='"+ID+"';");
            if(rs.next()){
                
                cita = new Cita();
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
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la consultar cita..."+e.getMessage());
        }        
        return cita;
    }
    
    public void ActualizarCita(Cita cita) {

        try {
            ps = conexion.prepareStatement("update cita set CitaHora=?,CitaEstado=?,CitaArea=?,CitaFecha=?,CitaDetalles=? where ID_Mascota=?;");
            ps.setString(1, cita.getHoraCita());
            ps.setString(2, cita.getEstadoCita());
            ps.setString(3, cita.getAreacita());
            ps.setString(4, cita.getFechaCita());
            ps.setString(5, cita.getDetalleCita());
            ps.setString(6, cita.getID_mascota());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Mensajeria.Message("ERROR en la actualizacion del registro..." + e.getMessage());
        }
    }
    
    public void EliminarCita(String ID){
        try{      
            ps = conexion.prepareStatement("delete from cita where ID_Mascota='"+ID+"';");
            ps.executeUpdate();
            ps.close();        
        } catch (Exception e) {
            Mensajeria.Message("ERROR en la eliminacion del registro..."+e.getMessage());
        }
    }
    
    public void FiltrarXAreaFecha(JTable tabla,String area,String fecha){
        
        tabla.setModel(modeloCita);
        Cita cita = new Cita();
        
        try{
            rs = st.executeQuery("SELECT CitaHora,CitaEstado,CitaArea,CitaFecha,CitaDetalles,ID_Mascota,MascotaNombre,MascotaEspecie,MascotaSexo,DueñoDNI,DueñoNombre,DueñoApellido,DueñoCelular from cita where CitaArea='"+area+"' and CitaFecha='"+fecha+"';");
            
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
            Mensajeria.Message("ERROR en la seleccion de la cita..."+e.getMessage());
        }  
    }
    
}
