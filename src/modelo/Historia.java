package modelo;

public class Historia {

    /*VARIABLES DE PROPIETARIO*/
   private String DNI;
     private String NombrePropietario;
      private String Apellido;
      private String Celular;
    /*VARIABLES DE MASCOTA*/
      private String ID_mascota;
     private  String NombreMascosta;
     private  String Especie;
      private String Sexo;
    /*VARIABLES DE HISTORIAL CLINICO*/
     private  String ID_historia;
     private  String Tratamiento;
      private String Detallecita;
       private String Diagnostico;
    
    public Historia(){} 

    public String getDNI() {return DNI;}
    public void setDNI(String DNI) {this.DNI = DNI;}

    public String getNombrePropietario() {return NombrePropietario;}
    public void setNombrePropietario(String NombrePropietario) {this.NombrePropietario = NombrePropietario;}

    public String getApellido() {return Apellido;}
    public void setApellido(String Apellido) {this.Apellido = Apellido;}

    public String getCelular() {return Celular;}
    public void setCelular(String Celular) {this.Celular = Celular;}

    public String getID_mascota() {return ID_mascota;}
    public void setID_mascota(String ID_mascota) {this.ID_mascota = ID_mascota;}

    public String getNombreMascosta() {return NombreMascosta;}
    public void setNombreMascosta(String NombreMascosta) {this.NombreMascosta = NombreMascosta;}

    public String getEspecie() {return Especie;}
    public void setEspecie(String Especie) {this.Especie = Especie;}

    public String getSexo() {return Sexo;}
    public void setSexo(String Sexo) {this.Sexo = Sexo;}

    public String getID_historia() {return ID_historia;}
    public void setID_historia(String ID_historia) {this.ID_historia = ID_historia;}

    public String getTratamiento() {return Tratamiento;}
    public void setTratamiento(String Tratamiento) {this.Tratamiento = Tratamiento;}

    public String getDetallecita() {return Detallecita;}
    public void setDetallecita(String Detallecita) {this.Detallecita = Detallecita;}

    public String getDiagnostico() {return Diagnostico;}
    public void setDiagnostico(String Diagnostico) {this.Diagnostico = Diagnostico;}
 
    public Object [] RegistroHistoria(){
        
        Object [] fila = {ID_mascota,NombreMascosta,Especie,Sexo,DNI,NombrePropietario,Apellido,Celular,ID_historia,Detallecita,Diagnostico,Tratamiento};
       return fila;
    }   
}
