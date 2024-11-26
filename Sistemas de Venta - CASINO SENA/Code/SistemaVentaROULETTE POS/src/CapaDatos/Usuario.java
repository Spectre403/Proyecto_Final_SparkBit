
package CapaDatos;


public class Usuario {
    
    private int IdUsuario;
    private String Documento;
    private String NombreCompleto;
    private String Correo;
    private String Clave;
    private int IdRol; 
    private int  FechaRegistro;
    private String Estado;

    public Usuario() {
    }

    public Usuario(int IdUsuario, String Documento, String NombreCompleto, String Correo, String Clave, int IdRol, int FechaRegistro, String Estado) {
        this.IdUsuario = IdUsuario;
        this.Documento = Documento;
        this.NombreCompleto = NombreCompleto;
        this.Correo = Correo;
        this.Clave = Clave;
        this.IdRol = IdRol;
        this.FechaRegistro = FechaRegistro;
        this.Estado = Estado;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    public int getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(int FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
