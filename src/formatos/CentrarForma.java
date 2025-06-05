package formatos;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class CentrarForma {

     public static void CPanel(JDesktopPane pan,JInternalFrame inf){
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width - 120 ),
                         (desktopSize.height - jifSize.height));
    }
     public static void CPanel2(JDesktopPane pan,JInternalFrame inf){
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width),
                         (desktopSize.height - jifSize.height + 10));
    }
     public static void CPanel3(JDesktopPane pan,JInternalFrame inf){
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width -500),
                         (desktopSize.height - jifSize.height + 30));
    }
     public static void CPanel4(JDesktopPane pan,JInternalFrame inf){
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width ),
                         (desktopSize.height - jifSize.height));
    }
}
