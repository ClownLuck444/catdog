package Principal;

import controlador.*;
import vista.*;

public class Main {

    /*EMPLEADO INSTANCIAS*/
    public static CtrlRegistroPaciente ctrlRP;
    public static EmpRegistrarPaciente registroPac;

    public static CtrlEmpConsultar ctrlC;
    public static EmpConsultar consulta;

    public static CtrlRegistrarCita ctrlRC;
    public static EmpRegistrarCita registroCita;

    public static CtrlSeleccionarMascota ctrlSM;
    public static SeleccionarMascota selecionarM;

    public static CtrlMenuEmpleado controlME;
    public static MenuEmpleado me;

    /*LOGIN INSTANCIAS*/
    public static CtrlMasterLogin ctrlML;
    public static MasterLogin masterLog;

    public static CtrlLogin ctrlL;
    public static Login log;
    
    public static CtrlRegistrarse ctrlR;
    public static Registrarse reg;

    /*MEDICO INSTANCIAS*/
    public static CtrlMedConsultarCitas ctrlMCC;
    public static MedConsultarCitas mcc;
    
    public static CtrlMedRegistrarHistoria ctrlRH;
    public static MedRegistrarHistoria mrh;
    
    public static CtrlMedConsultarHistoria ctrlCH;
    public static MedConsultarHistoria mch;
    
    public static CtrlMenuMedico ctrlMM;
    public static MenuMedico mm;
    
    /*MENU PACIENTE*/
    public static CtrlPacConsultarHistoria ctrlPCH;
    public static PacConsultarHistoria pch;
    
    public static CtrlPacConsultarCita ctrlPCC;
    public static PacConsultarCita pcc;
    
    public static CtrlMenuPaciente ctrlMP;
    public static MenuPaciente mp;
    
    public static void main(String[] args) {

        masterLog = new MasterLogin();
        ctrlML = new CtrlMasterLogin(masterLog);
       
    }
}
