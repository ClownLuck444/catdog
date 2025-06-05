package DAO;

import formatos.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class DAOEmpConsultar extends ConectorBD{

    public DAOEmpConsultar(){};
    
    String [] cabezaMascota = {"ID MASCOTA","NOMBRE PACIENTE","TAMAÑO","COLOR","EDAD","FECHA NACIMIENTO","ESPECIE","SEXO","RAZA","VACUNAS"};
    DefaultTableModel modeloMascota = new DefaultTableModel(null,cabezaMascota);

    String [] cabezaDueño = {"DNI","NOMBRE","APELLIDO","DIRECCIÓN","CELULAR","CORREO","ID_Mascota"};
    DefaultTableModel modeloDueño = new DefaultTableModel(null,cabezaDueño);
    
    public void MostrarMascota(JTable tabla){
        
        tabla.setModel(modeloMascota);
        Mascota masc = new Mascota();
        
        try{
            rs = st.executeQuery("SELECT ID_Mascota,Mascota_nombre,Mascota_tamaño,Mascota_color,Mascota_edad,Mascota_nacimiento,"+
                                 "Mascota_especie,Mascota_sexo,Mascota_raza,Mascota_vacunas from mascota");
            while(rs.next()){

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
                
                modeloMascota.addRow(masc.RegistroMascota());
            } 
            conexion.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la conexion con la base de datos..."+e.getMessage());
        } 
    }
    
    public void MostrarDueño(JTable tabla){
        
        tabla.setModel(modeloDueño);
        Propietario prop = new Propietario();
        
        try{
            rs = st.executeQuery("SELECT DNI,Nombre,Apellido,Direccion,Celular,Correo,ID_Mascota from propietario");
            while(rs.next()){

                prop.setDNI(rs.getString(1));
                prop.setNombre(rs.getString(2));
                prop.setApellido(rs.getString(3));
                prop.setDireccion(rs.getString(4));
                prop.setCelular(rs.getString(5));
                prop.setCorreo(rs.getString(6));
                prop.setID_Mascota(rs.getString(7));
                
                modeloDueño.addRow(prop.RegistroDueño());
            }         
            conexion.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la conexion con la base de datos..."+e.getMessage());
        }  
    }
    
    public void FiltrarXNombreMascota(JTable tabla,String nombre){
        
        tabla.setModel(modeloMascota);
        Mascota masc = new Mascota();
        
        try{
            rs = st.executeQuery("SELECT ID_Mascota,Mascota_nombre,Mascota_tamaño,Mascota_color,Mascota_edad,Mascota_nacimiento,"+
                                 "Mascota_especie,Mascota_sexo,Mascota_raza,Mascota_vacunas from mascota where Mascota_nombre='"+nombre+"';");
            while(rs.next()){

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
                
                modeloMascota.addRow(masc.RegistroMascota());
            } 
            conexion.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la seleccion de mascota..."+e.getMessage());
        }  
    }
    
    public void FiltrarXDNIPropietario(JTable tabla,String DNI){
        
        tabla.setModel(modeloDueño);
        Propietario prop = new Propietario();
        
        try{
            rs = st.executeQuery("SELECT DNI,Nombre,Apellido,Direccion,Celular,Correo,ID_Mascota from propietario where DNI='"+DNI+"';");
            while(rs.next()){

                prop.setDNI(rs.getString(1));
                prop.setNombre(rs.getString(2));
                prop.setApellido(rs.getString(3));
                prop.setDireccion(rs.getString(4));
                prop.setCelular(rs.getString(5));
                prop.setCorreo(rs.getString(6));
                prop.setID_Mascota(rs.getString(7));
                
                modeloDueño.addRow(prop.RegistroDueño());
            } 
            conexion.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la seleccion de propietario..."+e.getMessage());
        }
    }
    
    public void EliminarPaciente(String ID){
        try {      
            ps = conexion.prepareStatement("delete from mascota where ID_Mascota='"+ID+"';");
            ps.executeUpdate();
            ps.close();        
        } catch (Exception e) {
            Mensajeria.Message("ERROR en la eliminacion del registro..."+e.getMessage());
        }
    }
    
    public void EliminarPropietario(String ID){
        try {      
            ps = conexion.prepareStatement("delete from propietario where ID_Mascota='"+ID+"';");
            ps.executeUpdate();
            Mensajeria.Message("SE ELIMINO AL PACIENTE "+ID+" CORRECTAMENTE!!!");
            ps.close();        
        } catch (Exception e) {
            Mensajeria.Message("ERROR en la eliminacion del registro..."+e.getMessage());
        }
    }
    
}
