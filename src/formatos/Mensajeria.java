package formatos;

import javax.swing.JOptionPane;

public class Mensajeria {
    
    public static void Message(String mensaje){
    JOptionPane.showMessageDialog(null,mensaje);
    }    

    public static String Input(String mensaje){
    return JOptionPane.showInputDialog(mensaje);
    }

}
