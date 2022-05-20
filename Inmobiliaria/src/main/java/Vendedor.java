import java.util.*;


public class Vendedor extends Cliente{
    ArrayList<Propiedad> propiedades;
    
    public Vendedor(String nombre, String rut, int idCliente, int telefono, String mail, String pass){
        super(nombre, rut, idCliente, telefono, mail, pass);
    }
    
    public void mostrarNombre(){
        
        System.out.println(getNombre());
    }
    
}
