package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*;
import procesos.*;
import DAO.*;
import Principal.*;
import formatos.*;

public class CtrlRegistrarse implements ActionListener{

    Registrarse vista;
    DAORegistrarse crud;
    Usuario usu;
    
    public CtrlRegistrarse(Registrarse r){
        vista = r;
        vista.btnREGISTRARSE.addActionListener(this);
        vista.btnCANCELAR.addActionListener(this);
        ProcesosRegistrarse.CompletarCombos(r);
        ProcesosRegistrarse.Presentacion(r);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if( ae.getSource() == vista.btnREGISTRARSE){
         
            String contraseña = vista.psscontraseña.getText();
            String confirmcontra = vista.pssconfirmarcontraseña.getText();

            if(confirmcontra.equals(contraseña)){
                
                usu = ProcesosRegistrarse.LeerUsuario(vista);
                crud = new DAORegistrarse();
                crud.RegistrarUsuario(usu,vista);
                
                Main.log = new Login();
                Main.ctrlL = new CtrlLogin(Main.log);
                Main.log.setVisible(true);
                vista.setVisible(false);
                
            }else{
                Mensajeria.Message("La contraseña no coincide...");
            }            
        }
        if( ae.getSource() == vista.btnCANCELAR){
            
            Main.log = new Login();
            Main.ctrlL = new CtrlLogin(Main.log);
            Main.log.setVisible(true);
            vista.setVisible(false);
        }
        
    }
    
    
}
