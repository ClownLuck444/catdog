
package DAO;

import controlador.*;
import formatos.*;
import vista.*;
import Principal.*;
import modelo.*;


public class DAOLogin extends ConectorBD implements Constantes{
    
    Login log;
    CtrlLogin ctrlL;
    CtrlMenuEmpleado ctrlme;
    public boolean encontrado;
    
    public void IngresarMenu(Login log) {
        
        try {
            
            String user = log.txtusuario.getText();
            String pass = log.passcontraseña.getText();
            encontrado = false;
            
            rs = st.executeQuery("select usuario,contraseña,cargo from usuario ");
            
            while (rs.next() && (encontrado != true)) {
                
                String usuario = rs.getString(1);
                String contraseña = rs.getString(2);
                String cargo = rs.getString(3);
                
                if (user.equals(usuario) && pass.equals(contraseña)) {
                    
                    if (cargo.equals("medico")) {

                        Main.mm = new MenuMedico();
                        Main.ctrlMM = new CtrlMenuMedico(Main.mm);
                        Main.mm.setVisible(true);
                        log.setVisible(false);
                        encontrado = true;
                        
                    }else{
                                               
                        Main.me = new MenuEmpleado();
                        Main.controlME = new CtrlMenuEmpleado(Main.me);
                        Main.me.setVisible(true);
                        log.setVisible(false);
                        encontrado = true;
                    }                
                }
            }
            if (encontrado != true) {
                Mensajeria.Message("El usuario y la contraseña no coinciden");
            }
            rs.close();
        }catch(Exception e){
            Mensajeria.Message("ERROR en la conexion con la base de datos.."+e.getMessage());
        }
    }
    
    public boolean Verdadero(){return encontrado;}
}


