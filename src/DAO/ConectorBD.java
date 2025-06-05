package DAO;

import formatos.*;
import java.sql.*;

public class ConectorBD implements CadenaConexion{

    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData mdata;
    
    public ConectorBD(){
        
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA,USUARIO,CLAVE);
            st = conexion.createStatement();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la conexion con la base de datos.."+e.getMessage());
        }   
    }    
}
