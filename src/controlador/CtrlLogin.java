
package controlador;

import DAO.*;
import Principal.*;
import java.awt.event.*;
import vista.*;

public class CtrlLogin implements ActionListener{
    
    Login vista;
    DAOLogin crud;
    
    public CtrlLogin(Login log){
        vista = log;  
        vista.btnACCEDER.addActionListener(this);
        vista.btnREGISTRARSE.addActionListener(this);
        log.setTitle("LOGIN");
        log.setLocationRelativeTo(null);
        log.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if( ae.getSource() == vista.btnACCEDER ){
         
            crud = new DAOLogin();            
            crud.IngresarMenu(vista);   
        }
        if( ae.getSource() == vista.btnREGISTRARSE ){
            
            Main.reg= new Registrarse();
            Main.ctrlR = new CtrlRegistrarse(Main.reg);
            Main.reg.setVisible(true);
            vista.setVisible(false);
        }       
    }
}
