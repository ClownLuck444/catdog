package DAO;

import modelo.*;
import formatos.*;
import vista.*;

public class DAORegistrarse extends ConectorBD{

    public void RegistrarUsuario(Usuario usu,Registrarse reg){
        
        String usuario = reg.txtusuario.getText();
        boolean encontrado = false;
        
        try{
            
            rs = st.executeQuery("SELECT usuario FROM usuario");
        
            while(rs.next() && (encontrado!= true)){
                
                String usuBD = rs.getString(1);
                
                if(usuBD.equals(usuario)){
                    
                    Mensajeria.Message("El usuario que usted ha ingresado ya existe...");
                    encontrado = true;
                }else{
                    
                    try {
                        ps = conexion.prepareStatement("INSERT INTO usuario (DNI,Nombres,Apellidos,Cargo,Usuario,Contraseña) VALUES (?,?,?,?,?,?);");
                        ps.setString(1, usu.getDNI());
                        ps.setString(2, usu.getNombres());
                        ps.setString(3, usu.getApellidos());
                        ps.setString(4, usu.getCargo());
                        ps.setString(5, usu.getUsuario());
                        ps.setString(6, usu.getContraseña());
                        ps.executeUpdate();
                    } catch (Exception e) {
                        Mensajeria.Message("ERROR no se puede insertar usuario... " + e.getMessage());
                    }
                    ps.close();
                    Mensajeria.Message("Se registro correctamente!!!");
                    encontrado = true;
                }
            }            
            rs.close();
        }catch(Exception e){
            Mensajeria.Message("Error no se puede identificar el usuario..."+e.getMessage());
        }
    }
    
    
}
