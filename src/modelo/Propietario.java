package modelo;

public class Propietario {

    String DNI;
    String nombre;
    String apellido;
    String direccion;
    String celular;
    String correo;
    String ID_Mascota;

    public Propietario(){}

    public String getDNI() {return DNI;}
    public void setDNI(String DNI) {this.DNI = DNI;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getCelular() {return celular;}
    public void setCelular(String celular) {this.celular = celular;}

    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}
    
    public String getID_Mascota() {return ID_Mascota;}
    public void setID_Mascota(String ID_Mascota) {this.ID_Mascota = ID_Mascota;}
    
    public Object [] RegistroDueño(){
        Object [] fila = {DNI,nombre,apellido,direccion,celular,correo,ID_Mascota};
        return fila;
    }
    
}
