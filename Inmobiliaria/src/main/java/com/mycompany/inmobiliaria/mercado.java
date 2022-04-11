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
    
    public int buscaPropietario(String rut){
        cliente cPivot;
        int i= 0;
        boolean verificador = false;
        while(i< vendedores.size()){
            cPivot = vendedores.get(i);
            if(rut.equals(cPivot.getRut())){
                verificador = true;
                return ( i +1 );
            }else{
                i++;
            }
        }
        if(verificador == false){
            System.out.println("El rut ingresado no pertenece a ningun propietario");
        }
        return 0;
    }
    public asesor agregarAsesor() throws IOException{
        asesor aPivot = null;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese Nombre");
        String nombre = lector.readLine();
        aPivot.setNombre(nombre);
        System.out.println("Ingrese Rut");
        String rut = lector.readLine();
        aPivot.setRut(rut);
        System.out.println("Ingrese Mail");
        String mail = lector.readLine();
        aPivot.setMail(mail);
        System.out.println("Ingrese Contraseña");
        String pass = lector.readLine();
        aPivot.setPass(pass);
        return aPivot;
    }
    
    public propiedades agregarPropiedad() throws IOException{
        propiedades pPivot = null;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el precio de la propiedad");
        String precio = lector.readLine();
        pPivot.setPrecio(Integer.parseInt(precio));
        System.out.println("Ingrese el numero de baños de la propiedad");
        String numBanos = lector.readLine();
        pPivot.setNumBanos(Integer.parseInt(numBanos));
        System.out.println("Ingrese el numero de piezas de la propiedad");
        String numPiezas = lector.readLine();
        pPivot.setNumPiezas(Integer.parseInt(numPiezas));
        pPivot.setTipo("Departamento");
        System.out.println("Ingrese la direccion de la propiedad");
        String direccion = lector.readLine();
        pPivot.setDireccion(direccion);
        pPivot.setId();
        System.out.println("Ingrese los metros cuadrados de la propiedad");
        String metrosCuadrados = lector.readLine();
        pPivot.setMetrosCuadrados(Integer.parseInt(metrosCuadrados));
        System.out.println("Ingrese el piso en que se encuentra la propiedad");
        int piso = Integer.parseInt(lector.readLine());
        pPivot.setPiso(piso);
        return pPivot;
    }
    
    public cliente agregarVendedores() throws IOException{
        cliente cPivot = null;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese Nombre");
        String nombre = lector.readLine();
        cPivot.setNombre(nombre);
        System.out.println("Ingrese Rut");
        String rut = lector.readLine();
        cPivot.setRut(rut);
        cPivot.setId();
        System.out.println("Ingrese Telefono");
        String telefono = lector.readLine();
        cPivot.setTelefono(Integer.parseInt(telefono));
        System.out.println("Ingrese Mail");
        String mail = lector.readLine();
        cPivot.setMail(mail);
        System.out.println("Ingrese Contraseña");
        String pass = lector.readLine();
        cPivot.setPass(pass);
        return cPivot;
        
        
    }
}