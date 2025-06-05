package formatos;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.*;

public class ManejarTabla {

    public static void AnchoColumnas(JTable t, int numcolumna,int ancho) {
        TableColumn column;
        column = t.getColumnModel().getColumn(numcolumna);
        column.setPreferredWidth(ancho);       
    }
    
   public static void JustificarCelda(JTable t,int numcolumna){
       DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
       modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
       t.getColumnModel().getColumn(numcolumna).setCellRenderer(modelocentrar);       
   }
   
   public static void FormatoTablaCategorias(JTable tabla){
       AnchoColumnas(tabla,0,100);
       JustificarCelda(tabla,0);
       AnchoColumnas(tabla,1,100);
       JustificarCelda(tabla,1);
       AnchoColumnas(tabla,2,250);
       AnchoColumnas(tabla,3,500);      
   }
   
    public static void CambiarTamañoColumnas(JTable tabla) {

        TableColumnModel columnModel = tabla.getColumnModel();

        for (int columna = 0; columna < tabla.getColumnCount(); columna++) {

            int width = 100; 

            for (int fila = 0; fila < tabla.getRowCount(); fila++) {

                TableCellRenderer renderer = tabla.getCellRenderer(fila, columna);

                Component componente = tabla.prepareRenderer(renderer, fila, columna);

                width = Math.max(componente.getPreferredSize().width + 1, width);

            }
            columnModel.getColumn(columna).setPreferredWidth(width);
        }
    }  
}
