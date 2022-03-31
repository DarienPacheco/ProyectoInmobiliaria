import java.io.* ;

public class asesor{
    private String nombreAsesor;
    private String rutAsesor;
    private String mailAsesor;
    private String passAsesor;
    private String disponibilidad;
    private String clasificacion;
    
    
    
    public asesor(String nombre, String rut, String mail, String disponibilidad, String clasificacion, String pass){
        this.nombreAsesor = nombre;
        this.rutAsesor = rut;
        this.mailAsesor = mail;
        this.disponibilidad = disponibilidad;
        this.clasificacion = clasificacion;
        this.passAsesor = pass;
    }

    public String getNombre() {
        return nombreAsesor;
    }

    public void setNombre(String nombre) {
        this.nombreAsesor = nombre;
    }

    public String getRut() {
        return rutAsesor;
    }

    public void setRut(String rut) {
        this.rutAsesor = rut;
    }

    public String getMail() {
        return mailAsesor;
    }

    public void setMail(String mail) {
        this.mailAsesor = mail;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getPass() {
        return passAsesor;
    }

    public void setPass(String pass) {
        this.passAsesor = pass;
    }
    

    
} // Fin clase