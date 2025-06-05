package controlador;

import java.awt.event.*;
import vista.*;
import DAO.*;
import formatos.*;

public class CtrlMedConsultarHistoria implements ActionListener{
    
    MedConsultarHistoria vista;
    DAOMedConsultarHistoria crud;
    
    public CtrlMedConsultarHistoria(MedConsultarHistoria mch) {
       vista = mch;
       vista.btnBUSCAR.addActionListener(this);
       vista.btnMOSTRAR_TODO.addActionListener(this);
       Cabecera.FormatoCabecera(vista.tblHISTORIAS);
       vista.setTitle("CONSULTAR HISTORIA CLINICA");
       ActualizarForma();
       vista.setVisible(true);       
    }
    
    void ActualizarForma(){       
        crud = new DAOMedConsultarHistoria();
        crud.MostrarHistorias(vista.tblHISTORIAS);
        ManejarTabla.CambiarTamañoColumnas(vista.tblHISTORIAS);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
 
        if(e.getSource() == vista.btnBUSCAR){
            
            crud = new DAOMedConsultarHistoria();
            String nombre = vista.txtid_historia.getText();
            crud.Filtrar(vista.tblHISTORIAS,nombre);
            vista.txtid_historia.setText("");
            ManejarTabla.CambiarTamañoColumnas(vista.tblHISTORIAS);
        }
        if(e.getSource()==vista.btnMOSTRAR_TODO){
            ActualizarForma();
        }     
    }  
}
