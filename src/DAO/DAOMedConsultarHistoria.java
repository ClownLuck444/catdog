
package DAO;

import formatos.Mensajeria;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;


public class DAOMedConsultarHistoria extends ConectorBD{
    
    String [] encabezadoHistoria = {"ID MASCOTA","NOMBRE MASCOTA","ESPECIE","SEXO","DNI","NOMBRE DUEÑO","APELLIDO","CELULAR","ID HISTORIA","CITA DETALLES","DIAGNOSTICO","TRATAMIENTO"};
    DefaultTableModel modeloHistoria = new DefaultTableModel(null,encabezadoHistoria);
    
    public void Filtrar(JTable tabla,String ID){
        
        tabla.setModel(modeloHistoria);
        Historia hc = new Historia();
        
        try{
            rs = st.executeQuery("SELECT ID_Mascota,MascotaNombre,MascotaEspecie,MascotaSexo,PropietarioDNI,PropietarioNombre,PropietarioApellido,PropietarioCelular,ID_Historia,CitaDetalles,Diagnostico,Tratamiento FROM historial where ID_Historia='"+ID+"';");
            while(rs.next()){

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
                
                modeloHistoria.addRow(hc.RegistroHistoria());
            } 
            conexion.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR ..."+e.getMessage());
        }
    }
    public void MostrarHistorias(JTable tabla){
        
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
            Mensajeria.Message("ERROR al mostrar la historia..."+e.getMessage());
        } 
    }
    
}
