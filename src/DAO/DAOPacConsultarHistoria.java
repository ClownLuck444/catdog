package DAO;

import formatos.*;
import modelo.*;

public class DAOPacConsultarHistoria extends ConectorBD{
    
    public Historia MostrarHostiria(String dni, String nombre){
        
        Historia hc=null ;    
        try{
            rs = st.executeQuery("SELECT ID_Mascota,MascotaNombre,MascotaEspecie,MascotaSexo,PropietarioDNI,PropietarioNombre,PropietarioApellido,PropietarioCelular,ID_Historia,CitaDetalles,Diagnostico,Tratamiento FROM historial where PropietarioDNI='"+dni+"' and MascotaNombre='"+nombre+"';");
            
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
}
