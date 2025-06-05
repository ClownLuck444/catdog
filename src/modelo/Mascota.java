package modelo;

public class Mascota {
    
    /*VARIABLES MASCOTA*/
      private String idmascota;
      private String nombrePaciente;
     private  String tamaño;
      private String color;
      private String edad;
      private String fechaNacimiento;
      private String especie;
      private String sexo;
      private String raza;
      private String vacunas;
    
    public Mascota(){}
    
    public String getIdmascota() {return idmascota;}
    public void setIdmascota(String idmascota) { this.idmascota = idmascota;}

    public String getNombrePaciente() {return nombrePaciente;}
    public void setNombrePaciente(String nombrePaciente) {this.nombrePaciente = nombrePaciente;}

    public String getTamaño() {return tamaño; }
    public void setTamaño(String tamaño) {this.tamaño = tamaño;}

    public String getColor() {return color; }
    public void setColor(String color) {this.color = color;}

    public String getEdad() {return edad;}
    public void setEdad(String edad) {this.edad = edad;}

    public String getFechaNacimiento() {return fechaNacimiento;}
    public void setFechaNacimiento(String fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

    public String getEspecie() {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) { this.sexo = sexo;}

    public String getRaza() { return raza;}
    public void setRaza(String raza) {this.raza = raza;}

    public String getVacunas() {return vacunas;}
    public void setVacunas(String vacunas) {this.vacunas = vacunas; }

    /**/
    public Object [] RegistroMascota(){
        Object [] fila = {idmascota,nombrePaciente,tamaño,color,edad,fechaNacimiento,especie,sexo,raza,vacunas};
        return fila;
    }
}
