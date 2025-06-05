package DAO;

import formatos.*;
import modelo.*;

public class DAOEmpRegistrarPaciente extends ConectorBD{

    public DAOEmpRegistrarPaciente() {}

    public void InsertarMascotas(Mascota masc){
        
        try{
            ps = conexion.prepareStatement("INSERT INTO mascota (ID_Mascota,Mascota_nombre,Mascota_tamaño,Mascota_color,Mascota_edad,Mascota_nacimiento,"+
                                           "Mascota_especie,Mascota_sexo,Mascota_raza,Mascota_vacunas) VALUES (?,?,?,?,?,?,?,?,?,?);");
            ps.setString(1, masc.getIdmascota());
            ps.setString(2, masc.getNombrePaciente());
            ps.setString(3, masc.getTamaño());
            ps.setString(4, masc.getColor());
            ps.setString(5, masc.getEdad());
            ps.setString(6, masc.getFechaNacimiento());
            ps.setString(7, masc.getEspecie());
            ps.setString(8, masc.getSexo());
            ps.setString(9, masc.getRaza());
            ps.setString(10, masc.getVacunas());
            ps.executeUpdate();
        }catch(Exception e){
            Mensajeria.Message("ERROR no se puede insertar mascota... "+e.getMessage());
        }  
    }
    
    public void InsertarPropietario(Propietario prop){
        
        try{
            ps = conexion.prepareStatement("INSERT INTO propietario (DNI,Nombre,Apellido,Direccion,Celular,Correo,ID_Mascota) VALUES (?,?,?,?,?,?,?);");
            ps.setString(1, prop.getDNI());
            ps.setString(2, prop.getNombre());
            ps.setString(3, prop.getApellido());
            ps.setString(4, prop.getDireccion());
            ps.setString(5, prop.getCelular());
            ps.setString(6, prop.getCorreo());
            ps.setString(7, prop.getID_Mascota());
            ps.executeUpdate();
            Mensajeria.Message("¡Datos insertados correctamente!");
            conexion.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR no se puede insertar propietario... "+e.getMessage());
        }  
    }
    
    public void ActualizarMascota(Mascota masc) {

        try {
            ps = conexion.prepareStatement("update mascota set Mascota_nombre=?,Mascota_tamaño=?,Mascota_color=?,Mascota_edad=?,Mascota_nacimiento=?,"+
                                           "Mascota_especie=?,Mascota_sexo=?,Mascota_raza=?,Mascota_vacunas=? where ID_Mascota=?;");
            ps.setString(1, masc.getNombrePaciente());
            ps.setString(2, masc.getTamaño());
            ps.setString(3, masc.getColor());
            ps.setString(4, masc.getEdad());
            ps.setString(5, masc.getFechaNacimiento());
            ps.setString(6, masc.getEspecie());
            ps.setString(7, masc.getSexo());
            ps.setString(8, masc.getRaza());
            ps.setString(9, masc.getVacunas());
            ps.setString(10, masc.getIdmascota());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Mensajeria.Message("ERROR en la actualizacion del registro..." + e.getMessage());
        }
    }
    
    public void ActualizarPropietario(Propietario prop) {
        
        try {
            ps = conexion.prepareStatement("update propietario set DNI=?,Nombre=?,Apellido=?,Direccion=?,Celular=?,Correo=? where ID_Mascota=?;");
            ps.setString(1, prop.getDNI());
            ps.setString(2, prop.getNombre());
            ps.setString(3, prop.getApellido());
            ps.setString(4, prop.getDireccion());
            ps.setString(5, prop.getCelular());
            ps.setString(6, prop.getCorreo());
            ps.setString(7, prop.getID_Mascota());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Mensajeria.Message("ERROR en la actualizacion del registro..." + e.getMessage());
        }
        
    }
    
    public Mascota CompletarCuadrosMascota(String id){
        
        Mascota masc = null;    
        try{
            rs = st.executeQuery("SELECT ID_Mascota,Mascota_nombre,Mascota_tamaño,Mascota_color,Mascota_edad,Mascota_nacimiento,"+
                                 "Mascota_especie,Mascota_sexo,Mascota_raza,Mascota_vacunas from mascota where ID_Mascota='"+id+"';");
            if(rs.next()){
            masc = new Mascota();
                masc.setIdmascota(rs.getString(1));
                masc.setNombrePaciente(rs.getString(2));
                masc.setTamaño(rs.getString(3));
                masc.setColor(rs.getString(4));
                masc.setEdad(rs.getString(5));
                masc.setFechaNacimiento(rs.getString(6));
                masc.setEspecie(rs.getString(7));
                masc.setSexo(rs.getString(8));
                masc.setRaza(rs.getString(9));
                masc.setVacunas(rs.getString(10));
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la consultar mascota..."+e.getMessage());
        }        
        return masc;
    }
    
    public Propietario CompletarCuadrosDueño(String id){
        
        Propietario prop = null;    
        try{
            rs = st.executeQuery("SELECT DNI,Nombre,Apellido,Direccion,Celular,Correo,ID_Mascota from propietario where ID_Mascota='"+id+"';");
            if(rs.next()){
            prop = new Propietario();
                prop.setDNI(rs.getString(1));
                prop.setNombre(rs.getString(2));
                prop.setApellido(rs.getString(3));
                prop.setDireccion(rs.getString(4));
                prop.setCelular(rs.getString(5));
                prop.setCorreo(rs.getString(6));
                prop.setID_Mascota(rs.getString(7));
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la consultar mascota..."+e.getMessage());
        }        
        return prop;
    }
       
}
