package DAO;

import formatos.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class DAOMedRegistrarHistoria extends ConectorBD{
    
    String [] encabezadoHistoria = {"ID MASCOTA","NOMBRE MASCOTA","ESPECIE","SEXO","DNI","NOMBRE DUEÑO","APELLIDO","CELULAR","ID HISTORIA","CITA DETALLES","DIAGNOSTICO","TRATAMIENTO"};
    DefaultTableModel modeloHistoria = new DefaultTableModel(null,encabezadoHistoria);
    
    public void InsertarConsulta(Historia hc){
        
        try{
            ps = conexion.prepareStatement("INSERT INTO historial (ID_Mascota,MascotaNombre,MascotaEspecie,MascotaSexo,PropietarioDNI,PropietarioNombre,PropietarioApellido,PropietarioCelular,ID_Historia,CitaDetalles,Diagnostico,Tratamiento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);");
            ps.setString(1, hc.getID_mascota());
            ps.setString(2, hc.getNombreMascosta());
            ps.setString(3, hc.getEspecie());
            ps.setString(4, hc.getSexo());
            ps.setString(5, hc.getDNI());
            ps.setString(6, hc.getNombrePropietario());
            ps.setString(7, hc.getApellido());
            ps.setString(8, hc.getCelular());
            ps.setString(9, hc.getID_historia());
            ps.setString(10,hc.getDetallecita());
            ps.setString(11,hc.getDiagnostico());
            ps.setString(12,hc.getTratamiento());
            ps.executeUpdate();
            Mensajeria.Message("¡Datos registrados correctamente!!");
            conexion.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR no se puede insertar datos... "+e.getMessage());
        }  
    }
    
    public void MostrarHistoria (JTable tabla){
        
        tabla.setModel(modeloHistoria);
        Historia hc = new Historia();
        
        try{
            rs = st.executeQuery("SELECT ID_Mascota,MascotaNombre,MascotaEspecie,MascotaSexo,PropietarioDNI,PropietarioNombre,PropietarioApellido,PropietarioCelular,ID_Historia,CitaDetalles,Diagnostico,Tratamiento FROM historial");
            while(rs.next()){
                hc.setID_mascota(rs.getString(1));
                hc.setNombreMascosta(rs.getString(2));
                hc.setEspecie(rs.getString(3));
                hc.setSexo(rs.getString(4));
                hc.setDNI(rs.getString(5));
                hc.setNombrePropietario(rs.getString(6));
                hc.setApellido(rs.getString(7));
                hc.setCelular(rs.getString(8));
                hc.setID_historia(rs.getString(9));
                hc.setDetallecita(rs.getString(10));
                hc.setDiagnostico(rs.getString(11));
                hc.setTratamiento(rs.getString(12));
                
                modeloHistoria.addRow(hc.RegistroHistoria());
            } 
            conexion.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR al mostrar la tabla historia..."+e.getMessage());
        } 
    }
    public Historia CompletarCuadros(String ID){
        
        Historia hc=null ;    
        try{
            rs = st.executeQuery("SELECT ID_Mascota,MascotaNombre,MascotaEspecie,MascotaSexo,PropietarioDNI,PropietarioNombre,PropietarioApellido,PropietarioCelular,ID_Historia,CitaDetalles,Diagnostico,Tratamiento FROM historial where ID_Historia='"+ID+"';");
            
            if(rs.next()){               
                hc= new Historia();
                hc.setID_mascota(rs.getString(1));
                hc.setNombreMascosta(rs.getString(2));
                hc.setEspecie(rs.getString(3));
                hc.setSexo(rs.getString(4));
                hc.setDNI(rs.getString(5));
                hc.setNombrePropietario(rs.getString(6));
                hc.setApellido(rs.getString(7));
                hc.setCelular(rs.getString(8));
                hc.setID_historia(rs.getString(9));
                hc.setDetallecita(rs.getString(10));
                hc.setDiagnostico(rs.getString(11));
                hc.setTratamiento(rs.getString(12));
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR ..."+e.getMessage());
        }        
        return hc;
    }
     public void Actualizar(Historia hc) {

        try {
            ps = conexion.prepareStatement("UPDATE historial set CitaDetalles=?,Diagnostico=?,Tratamiento=? where ID_Historia=?;");
            
            ps.setString(1,hc.getDetallecita());
            ps.setString(2,hc.getDiagnostico());
            ps.setString(3,hc.getTratamiento());
            ps.setString(4, hc.getID_historia());
            ps.executeUpdate();
            Mensajeria.Message("¡Actualizado!");
            ps.close();
        } catch (Exception e) {
            Mensajeria.Message("ERROR en la actualizacion del registro..." + e.getMessage());
        }
    }
     public void Eliminar(String ID){
         
        try{      
            ps = conexion.prepareStatement("DELETE FROM historial WHERE ID_Historia='"+ID+"';");
            ps.executeUpdate();
            ps.close();        
        } catch (Exception e) {
            Mensajeria.Message("ERROR en la eliminacion del registro..."+e.getMessage());
        }
    }

 
}
