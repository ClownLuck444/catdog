package modelo;

public class Usuario {
    
     private  String DNI;
     private  String Nombres;
     private  String Apellidos;
     private  String Cargo;
     private  String Usuario;
     private  String Contraseña;

    public Usuario() {}
    
    public String getDNI() {return DNI;}
    public void setDNI(String DNI) {this.DNI = DNI;}

    public String getNombres() {return Nombres;}
    public void setNombres(String Nombres) {this.Nombres = Nombres;}

    public String getApellidos() {return Apellidos;}
    public void setApellidos(String Apellidos) {this.Apellidos = Apellidos;}

    public String getCargo() {return Cargo;}
    public void setCargo(String Cargo) {this.Cargo = Cargo;}

    public String getUsuario() {return Usuario;}
    public void setUsuario(String Usuario) {this.Usuario = Usuario;}

    public String getContraseña() {return Contraseña;}
    public void setContraseña(String Contraseña) {this.Contraseña = Contraseña;}   
}
