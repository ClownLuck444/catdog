package modelo;

public class Cita {

    /*VARIABLES DE PROPIETARIO*/
      private String DNI;
      private String nombrePropietario;
       private String apellido;
      private String celular;
    /*VARIABLES DE MASCOTA*/
       private String ID_mascota;
       private String nombreMascosta;
      private  String especie;
       private String sexo;
    /*VARIABLES DE LA CITA*/
       private String areacita;
       private String fechaCita;
      private  String horaCita;
      private  String estadoCita;
       private String detalleCita;
    
    public Cita(){} 

    public String getDNI() {return DNI;}
    public void setDNI(String DNI) {this.DNI = DNI;}

    public String getNombrePropietario() {return nombrePropietario;}
    public void setNombrePropietario(String nombrePropietario) {this.nombrePropietario = nombrePropietario;}

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getCelular() {return celular;}
    public void setCelular(String celular) {this.celular = celular;}

    public String getID_mascota() {return ID_mascota;}
    public void setID_mascota(String ID_mascota) {this.ID_mascota = ID_mascota;}

    public String getNombreMascosta() {return nombreMascosta;}
    public void setNombreMascosta(String nombreMascosta) {this.nombreMascosta = nombreMascosta;}

    public String getEspecie() {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}

    public String getAreacita() {return areacita;}
    public void setAreacita(String areacita) {this.areacita = areacita;}

    public String getFechaCita() {return fechaCita;}
    public void setFechaCita(String fechaCita) {this.fechaCita = fechaCita;}

    public String getHoraCita() {return horaCita;}
    public void setHoraCita(String horaCita) {this.horaCita = horaCita;}

    public String getEstadoCita() {return estadoCita;}
    public void setEstadoCita(String estadoCita) {this.estadoCita = estadoCita;}

    public String getDetalleCita() {return detalleCita;}
    public void setDetalleCita(String detalleCita) {this.detalleCita = detalleCita;}

    public Object [] RegistroCita(){
        Object [] fila = {horaCita,estadoCita,areacita,fechaCita,detalleCita,ID_mascota,nombreMascosta
                         ,especie,sexo,DNI,nombrePropietario,apellido,celular};
        return fila;
    }
    
}
