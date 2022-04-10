import java.io.* ;
import java.util.*;

public class mercado{
    private int[] demanda = new int[4];
    HashMap mapaPropiedades = new HashMap();
    ArrayList<asesor> asesores = new ArrayList();
    ArrayList<cliente> vendedores= new ArrayList();
    
    public int[] getDemanda() {
        return demanda;
    }

    public void setDemanda(int[] demanda) {
        this.demanda = demanda;
    }

    public mercado (int a, int b, int c, int d,int id, propiedades x, asesor aa,cliente vv){

        this.demanda[0] = a;
        this.demanda[1] = b;
        this.demanda[2] = c;
        this.demanda[3] = d;
        mapaPropiedades.put(id,x);
        asesores.add(aa);
        vendedores.add(vv);
    }
    
    public void busqueda(int id){
        if(mapaPropiedades.containsKey(id)){
            propiedades y = (propiedades) mapaPropiedades.get(id);
            System.out.println("Su busqueda nos otorgo el siguiente resultado:");
            System.out.println("Casa : " + y.getId());
            System.out.println("Habitaciones: " + y.getNumPiezas());
            System.out.println("Baños: " + y.getNumBanos());
            System.out.println("Area: " + y.getMetrosCuadrados());
            System.out.println("Precio: " + y.getPrecio() + "UF");
        }else{
            System.out.println("La Casa que esta buscando no existe.");
        }
    }
    
    public void busqueda(int precio, boolean supinf){
        boolean verificador = false;
        int contador = 1;
        int limite = mapaPropiedades.size();
        while(contador<=limite){
            propiedades y = (propiedades) mapaPropiedades.get(contador);
            if(supinf){
                if(precio>= y.getPrecio()){
                    System.out.println("Su busqueda nos otorgo el siguiente resultado:");
                    System.out.println("Casa : " + y.getId());
                    System.out.println("Precio: " + y.getPrecio() + "UF");
                    System.out.println("Habitaciones: " + y.getNumPiezas());
                    System.out.println("Baños: " + y.getNumBanos());
                    System.out.println("Area: " + y.getMetrosCuadrados());   
                    verificador = true;
                }
            }else{
                if(precio<= y.getPrecio()){
                    System.out.println("Su busqueda nos otorgo el siguiente resultado: ");
                    System.out.println("Casa : " + y.getId());
                    System.out.println("Precio: " + y.getPrecio() + "UF");
                    System.out.println("Habitaciones: " + y.getNumPiezas());
                    System.out.println("Baños: " + y.getNumBanos());
                    System.out.println("Area: " + y.getMetrosCuadrados());   
                    verificador = true;    
                }
            }
            contador++;
        }
        if(verificador==false){
            System.out.println("Su busqueda no ha dado resultados.\n");
        }
    }
    
    public void mostrarAsesores(){
        asesor aPivot;
        int i = 0 ;
        while(i < asesores.size()){
            aPivot = asesores.get(i);
            System.out.println( "Nombre : " + aPivot.getNombre() );
            System.out.println( "Rut : " + aPivot.getRut());
            System.out.println( "Contacto : " + aPivot.getMail());
            System.out.println("--------------------------------\n");
            i++;
        }  
    }
    
    public void mostrarVendedores(){
        cliente cPivot;
        int i = 0 ;
        while(i < vendedores.size()){
            cPivot = vendedores.get(i);
            System.out.println( "Nombre : " + cPivot.getNombre() );
            System.out.println( "Rut : " + cPivot.getRut());
            System.out.println( "Contacto : " + cPivot.getMail());
            System.out.println( "           " + cPivot.getTelefono());
            System.out.println("--------------------------------\n");
            i++;
        }  
    }
        
    public int buscaAsesor(String rut){
        asesor aPivot;
        int i = 0;
        boolean verificador = false;
        while(i < asesores.size()){
            aPivot = asesores.get(i);
            if(rut.equals(aPivot.getRut())){
                verificador = true;
                return ( i + 1 );
            }else{
               i++; 
            }        
        }
        if(verificador == false){
            System.out.println("El rut ingresado no pertenece a ningun asesor.");
        }
        return 0;
    }
}