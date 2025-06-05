    package formatos;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;

public class FormatosDatos {
    
    public static String FormatoTextoDate(JDateChooser fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha.getDate());
    }
    
}
