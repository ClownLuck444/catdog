
package controlador;

import Principal.*;
import formatos.CentrarForma;
import java.awt.event.*;
import javax.swing.JFrame;
import vista.*;

public class CtrlMenuMedico implements ActionListener {

    MenuMedico vista;

    public CtrlMenuMedico(MenuMedico mm) {
        vista = mm;
        vista.mitemREGISTRAR_HISTORIA.addActionListener(this);
        vista.mitemCONSULTAR_HISTORIA.addActionListener(this);
        vista.mitemCONSULTAR_CITAS.addActionListener(this);
        mm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mm.setDefaultCloseOperation(mm.EXIT_ON_CLOSE);
        mm.setTitle("MENÚ MEDICO");
        mm.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.mitemCONSULTAR_CITAS) {
            
            Main.mcc = new MedConsultarCitas();
            Main.ctrlMCC = new CtrlMedConsultarCitas(Main.mcc);
            vista.dtkpContenedorMedico.removeAll();
            vista.dtkpContenedorMedico.updateUI();
            vista.dtkpContenedorMedico.add(Main.mcc);
            CentrarForma.CPanel(vista.dtkpContenedorMedico, Main.mcc);           
        }
        if (e.getSource() == vista.mitemREGISTRAR_HISTORIA) {
            
            Main.mrh = new MedRegistrarHistoria();
            Main.ctrlRH = new CtrlMedRegistrarHistoria(Main.mrh);
            vista.dtkpContenedorMedico.removeAll();
            vista.dtkpContenedorMedico.updateUI();
            vista.dtkpContenedorMedico.add(Main.mrh);
            CentrarForma.CPanel2(vista.dtkpContenedorMedico, Main.mrh);
        }
        if (e.getSource() == vista.mitemCONSULTAR_HISTORIA) {
            
            Main.mch = new MedConsultarHistoria();
            Main.ctrlCH = new CtrlMedConsultarHistoria(Main.mch);
            vista.dtkpContenedorMedico.removeAll();
            vista.dtkpContenedorMedico.updateUI();
            vista.dtkpContenedorMedico.add(Main.mch);
            CentrarForma.CPanel(vista.dtkpContenedorMedico, Main.mch);
        }       
    }
}
