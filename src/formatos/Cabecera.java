package formatos;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;

public class Cabecera {
    
    public static void FormatoCabecera(JTable tabla){
        tabla.getTableHeader().setFont(new Font("Dubai", Font.BOLD,14));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(new Color(75,77,81));
        tabla.getTableHeader().setForeground(new Color(255, 255, 255));
        tabla.setRowHeight(25);
    }
}
