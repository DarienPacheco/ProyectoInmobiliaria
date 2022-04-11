import java.io.* ;
import java.util.concurrent.ThreadLocalRandom;
public class propiedades{
    private int precio;
    private int numBanos;
    private int numPiezas;
    private String tipo;
    private String direccion;
    private int id;
    private int metrosCuadrados;
    private int Piso;
    
    public propiedades (String precio, String numBanos, String numPiezas, String tipo, String direccion, String id, String metrosCuadrados, int piso){
        this.precio = Integer.parseInt(precio);
        this.numBanos = Integer.parseInt(numBanos);
        this.numPiezas = Integer.parseInt(numPiezas);
        this.tipo = tipo;
        this.direccion = direccion;
        this.id = Integer.parseInt(id);
        this.metrosCuadrados = Integer.parseInt(metrosCuadrados);
        this.Piso = piso;
    }
    public propiedades (String precio, String numBanos, String numPiezas, String tipo, String direccion, String id, String metrosCuadrados){
        this.precio = Integer.parseInt(precio);
        this.numBanos = Integer.parseInt(numBanos);
        this.numPiezas = Integer.parseInt(numPiezas);
        this.tipo = tipo;
        this.direccion = direccion;
        this.id = Integer.parseInt(id);
        this.metrosCuadrados = Integer.parseInt(metrosCuadrados);
    }

    
    public void mostrar(int banos,int piezas, int metros){
        System.out.println("Esta propiedad cuenta con " + banos + " baños, " + piezas + " piezas y con " + metros + " metros cuadrados.");
    }
    
    public void mostrar(int banos,int piezas, int metros, int piso){
        System.out.println("Esta propiedad cuenta con " + banos + " baños, " + piezas + " piezas, esta a " + piso + " por encima del primer piso y con " + metros + " metros cuadrados.");
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    public int getNumPiezas() {
        return numPiezas;
    }

    public void setNumPiezas(int numPiezas) {
        this.numPiezas = numPiezas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        int numero = (int)(Math.random()*10000+1);
        
        this.id = numero;
        
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getPiso() {
        return Piso;
    }

    public void setPiso(int Piso) {
        this.Piso = Piso;
    }
    
    
} // Fin clase