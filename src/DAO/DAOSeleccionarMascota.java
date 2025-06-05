package DAO;

import formatos.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class DAOSeleccionarMascota extends ConectorBD {

    public void MostrarMascota(JTable tabla){
        
        String [] cabezaMascota = {"ID MASCOTA","NOMBRE PACIENTE","TAMAÑO","COLOR","EDAD","FECHA NACIMIENTO","ESPECIE","SEXO","RAZA","VACUNAS"};
        DefaultTableModel modeloMascota = new DefaultTableModel(null,cabezaMascota);   
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
            rs.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la conexion con la base de datos..."+e.getMessage());
        } 
    }
    
    public Mascota CompletarCitaMascota(String id){
        
        Mascota masc = null;    
        try{
            rs = st.executeQuery("SELECT ID_Mascota,Mascota_nombre,Mascota_especie,Mascota_sexo from mascota where ID_Mascota='"+id+"';");
            if(rs.next()){
            masc = new Mascota();
                masc.setIdmascota(rs.getString(1));
                masc.setNombrePaciente(rs.getString(2));
                masc.setEspecie(rs.getString(3));
                masc.setSexo(rs.getString(4));
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la consultar mascota..."+e.getMessage());
        }        
        return masc;
    }
    
    public Propietario CompletarCitaDueño(String id){
        
        Propietario prop = null;    
        try{
            rs = st.executeQuery("SELECT DNI,Nombre,Apellido,Celular from propietario where ID_Mascota='"+id+"';");
            if(rs.next()){
            prop = new Propietario();
                prop.setDNI(rs.getString(1));
                prop.setNombre(rs.getString(2));
                prop.setApellido(rs.getString(3));
                prop.setCelular(rs.getString(4));
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la consultar mascota..."+e.getMessage());
        }        
        return prop;
    }
}
