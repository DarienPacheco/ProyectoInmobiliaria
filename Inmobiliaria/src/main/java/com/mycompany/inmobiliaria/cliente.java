import java.io.* ;
import java.util.*;

public class cliente{
    private String nombreCliente;
    private String rutCliente;
    private int idCliente;
    private int telefono;
    private String mailCliente;
    private String passCliente;
    private ArrayList<propiedades> props = new ArrayList();
    
    
    public cliente (String nombre, String rut, String id, String telefono, String mail, String pass, propiedades pp){
        this.nombreCliente = nombre;
        this.rutCliente = rut;
        this.idCliente = Integer.parseInt(id);
        this.telefono = Integer.parseInt(telefono);
        this.mailCliente = mail;
        this.passCliente = pass;
        props.add(pp);
    
    }
    
    
    
    public String getNombre() {
        return nombreCliente;
    }

    public void setNombre(String nombre) {
        this.nombreCliente = nombre;
    }

    public String getRut() {
        return rutCliente;
    }

    public void setRut(String rut) {
        this.rutCliente = rut;
    }

    public int getId() {
        return idCliente;
    }

    public void setId(int id) {
        this.idCliente = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mailCliente;
    }

    public void setMail(String mail) {
        this.mailCliente = mail;
    }

    public String getPass() {
        return passCliente;
    }

    public void setPass(String pass) {
        this.passCliente = pass;
    }
    

    
} // Fin clase