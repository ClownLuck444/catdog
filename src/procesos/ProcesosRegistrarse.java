package procesos;

import modelo.*;
import vista.*;

public class ProcesosRegistrarse implements Constantes{

    public static void Presentacion(Registrarse reg) {
        reg.setTitle("REGISTRARSE");
        reg.setLocationRelativeTo(null);
        reg.setVisible(true);
    }
 
    public static Usuario LeerUsuario (Registrarse reg){
     
        Usuario usuario = new Usuario();
        
        usuario.setDNI(reg.txtdni.getText());
        usuario.setNombres(reg.txtnombres.getText());
        usuario.setApellidos(reg.txtapellidos.getText());
        usuario.setCargo(reg.cbxcargo.getSelectedItem().toString());
        usuario.setUsuario(reg.txtusuario.getText());
        usuario.setContraseña(reg.psscontraseña.getText());
        
        return usuario;
    }
    
    public static void CompletarCombos(Registrarse reg){
        
        reg.cbxcargo.removeAllItems();
        
        for(int i = 0 ; i < CARGO.length ; i++){
            reg.cbxcargo.addItem(CARGO[i]);
        }    
    }  
}
