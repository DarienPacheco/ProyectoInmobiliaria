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
    
    public void busqueda(int i){
        if(mapaPropiedades.containsKey(i)){
            propiedades y = (propiedades) mapaPropiedades.get(i);
            System.out.println("Su busqueda nos otorgo el siguiente resultado: \n");
            System.out.println("Casa : " + y.getId() + "\n");
            System.out.println("Habitaciones: " + y.getNumPiezas() + "\n");
            System.out.println("Baños: " + y.getNumBanos() + "\n");
            System.out.println("Area: " + y.getMetrosCuadrados() + "\n");
            System.out.println("Precio: " + y.getPrecio() + "UF\n");
        }else{
            System.out.println("La Casa que esta buscando no existe.\n");
        }
    }
    
    public void busqueda(int i, boolean n){
        boolean c = false;
        int x = 1;
        int z = mapaPropiedades.size();
        while(x<=z){
            propiedades y = (propiedades) mapaPropiedades.get(x);
            if(n){
                if(i>= y.getPrecio()){
                    System.out.println("Su busqueda nos otorgo el siguiente resultado: \n");
                    System.out.println("Casa : " + y.getId() + "\n");
                    System.out.println("Precio: " + y.getPrecio() + "UF\n");
                    System.out.println("Habitaciones: " + y.getNumPiezas() + "\n");
                    System.out.println("Baños: " + y.getNumBanos() + "\n");
                    System.out.println("Area: " + y.getMetrosCuadrados() + "\n\n");   
                    c = true;
                }
            }else{
                if(i<= y.getPrecio()){
                    System.out.println("Su busqueda nos otorgo el siguiente resultado: \n");
                    System.out.println("Casa : " + y.getId() + "\n");
                    System.out.println("Precio: " + y.getPrecio() + "UF\n");
                    System.out.println("Habitaciones: " + y.getNumPiezas() + "\n");
                    System.out.println("Baños: " + y.getNumBanos() + "\n");
                    System.out.println("Area: " + y.getMetrosCuadrados() + "\n\n");   
                    c = true;    
                }
            }
            x++;
        }
        if(c==false){
            System.out.println("Su busqueda no ha dado resultados.\n");
        }
    }
        
    
}

   

    
 