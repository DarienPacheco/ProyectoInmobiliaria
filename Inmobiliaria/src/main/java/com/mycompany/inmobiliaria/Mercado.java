package com.mycompany.inmobiliaria;

import java.io.* ;
import java.util.*;

public class Mercado{
    private int[] demanda = new int[4];
    HashMap <Integer,Propiedades> mapaPropiedades;
    ArrayList<Asesor> asesores;
    ArrayList<Cliente> vendedores;
    
    public int[] getDemanda() {
        return demanda;
    }

    public void setDemanda(int[] demanda) {
        this.demanda = demanda;
    }

    public Mercado() {
        asesores = new ArrayList();
        vendedores= new ArrayList();
        mapaPropiedades = new HashMap();
    }
    
    public Mercado (int a, int b, int c, int d,int id, Propiedades x, Asesor aa,Cliente vv){

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
            Propiedades y = (Propiedades) mapaPropiedades.get(id);
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
            Propiedades y = (Propiedades) mapaPropiedades.get(contador);
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
    public void busqueda(int precioMin, int precioMax){
        for (Propiedades pp : mapaPropiedades.values()) {
            if ((precioMin < pp.getPrecio()) && (pp.getPrecio() < precioMax)){
                System.out.println("Su busqueda nos otorgo el siguiente resultado:");
                System.out.println("Casa : " + pp.getId());
                System.out.println("Precio: " +pp.getPrecio() + "UF");
                System.out.println("Habitaciones: " + pp.getNumPiezas());
                System.out.println("Baños: " + pp.getNumBanos());
                System.out.println("Area: " + pp.getMetrosCuadrados());   
            }
        }
    }
    public void mostrarAsesores(){
        if(asesores.size()==0){
            System.out.println("La lista se encuentra vacia");
        }
        Asesor aPivot;
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
        if(vendedores.size()==0){
            System.out.println("La lista se encuentra vacia");
        }
        Cliente cPivot;
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
    //Retorna un int el cual da la posicion del asesor buscado, en el mercado.
    public int buscaAsesor(String rut){
        if(asesores.size()==0){
            System.out.println("La lista se encuentra vacia");
            return 0;
        }        
        Asesor aPivot;
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
    //Otorga la posicion+1 de un propietario en la lista dandose el rut
    public int buscaPropietario(String rut){
        if(vendedores.size()==0){
            System.out.println("La lista se encuentra vacia");
            return 0;
        }
        Cliente cPivot;
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
    //Lo mismo que la anterior pero con el id.
    public int buscaPropietario(int id){
        if(vendedores.size()==0){
            System.out.println("La lista se encuentra vacia");
            return 0;
        }
        Cliente cPivot;
        int i= 0;
        boolean verificador = false;
        while(i< vendedores.size()){
            cPivot = vendedores.get(i);
            if(id == cPivot.getId()){
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
    public void agregarAsesor() throws IOException{
        Asesor aPivot = new Asesor();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese Nombre");
        aPivot.setNombre(lector.readLine());
        System.out.println("Ingrese Rut");
        aPivot.setRut(lector.readLine());
        System.out.println("Ingrese Mail");
        aPivot.setMail(lector.readLine());
        System.out.println("Ingrese Contraseña");
        aPivot.setPass(lector.readLine());
        System.out.println("Ingrese Disponibilidad");
        aPivot.setDisponibilidad(lector.readLine());
        System.out.println("Ingrese Clasificacion");
        aPivot.setClasificacion(lector.readLine());
        asesores.add(aPivot);
    }
    
    public void agregarPropiedad(int option, int posicion) throws IOException{
        Propiedades pPivot = new Propiedades();
        Cliente vPivot = vendedores.get(posicion);
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
        if(option == 1){
            pPivot.setTipo("Departamento");
            System.out.println("Ingrese el piso en que se encuentra la propiedad");
            int piso = Integer.parseInt(lector.readLine());
            pPivot.setPiso(piso);
        }
        if(option == 2){
            pPivot.setTipo("Casa");
        }
        
        System.out.println("Ingrese la direccion de la propiedad");
        String direccion = lector.readLine();
        pPivot.setDireccion(direccion);
        pPivot.setId((mapaPropiedades.size()+1));
        System.out.println("Ingrese los metros cuadrados de la propiedad");
        String metrosCuadrados = lector.readLine();
        pPivot.setMetrosCuadrados(Integer.parseInt(metrosCuadrados));
        mapaPropiedades.put(pPivot.getId(), pPivot);
        vPivot.props.add(pPivot);
        
    }
    
    public void agregarVendedores() throws IOException{
        Cliente cPivot = new Cliente();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese Nombre");
        String nombre = lector.readLine();
        cPivot.setNombre(nombre);
        System.out.println("Ingrese Rut");
        String rut = lector.readLine();
        cPivot.setRut(rut);
        System.out.println("Ingrese Id");
        rut = lector.readLine();
        cPivot.setId(Integer.parseInt(rut));
        System.out.println("Ingrese Telefono");
        String telefono = lector.readLine();
        cPivot.setTelefono(Integer.parseInt(telefono));
        System.out.println("Ingrese Mail");
        String mail = lector.readLine();
        cPivot.setMail(mail);
        System.out.println("Ingrese Contraseña");
        String pass = lector.readLine();
        cPivot.setPass(pass);
        vendedores.add(cPivot);
    }
    
    public void eliminarVendedor() throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese Id del Vendedor");
        int id = Integer.parseInt(lector.readLine());
        Cliente vPivot;
        for(int i = 0; i < vendedores.size(); i++){
            vPivot = vendedores.get(i);
            if(vPivot.getId() == id){
                vendedores.remove(i);
            }
        }
    }
    
    public void eliminarAsesor() throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese RUT del Asesor");
        String rut = lector.readLine();
        Asesor aPivot = new Asesor();
        
        for(int i = 0; i < asesores.size(); i++){
            aPivot = asesores.get(i);
            if(aPivot.getRut() == rut){
                asesores.remove(i);
            }
        }
    }
    //Loop el cual recibe un rut, ocupa buscaAsesor y permite modificar los valores existentes.
    //Para el caso de el rut, este antes de cambiarse verifica si ese ya existe dentro de la lista.
    //Para el resto de los casos permite una modificacion inmediata.
    public void modificarAsesor(String rut) throws IOException{
        String sPivot;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int i = buscaAsesor(rut);
        int x=1,y;
        if(i!=0){
            i--;
            Asesor aPivot = asesores.get(i);
            while(x!=0){
                System.out.println("Favor seleccione el valor a modificar");
                mostrarAsesor(aPivot);
                x = Integer.parseInt(lector.readLine());
                switch(x){
                    case 0:
                        break;
                    case 1:
                        System.out.println("Favor ingrese el nuevo valor.");
                        aPivot.setNombre(lector.readLine());
                        break;
                    case 2:
                        System.out.println("Favor ingrese el nuevo valor.");
                        sPivot=lector.readLine();
                        y=buscaAsesor(sPivot);
                        if(y!= 0){
                            System.out.println("El Rut ingresado ya existe.");
                            break;
                        }else{
                           aPivot.setRut(sPivot);
                           break;
                        }
                    case 3:  
                        System.out.println("Favor ingrese el nuevo valor.");
                        aPivot.setMail(lector.readLine());
                        break;
                    case 4:  
                        System.out.println("Favor ingrese el nuevo valor.");
                        aPivot.setPass(lector.readLine());
                        break;
                    case 5:  
                        System.out.println("Favor ingrese el nuevo valor.");
                        aPivot.setDisponibilidad(lector.readLine());
                        break;
                    case 6:  
                        System.out.println("Favor ingrese el nuevo valor.");
                        aPivot.setClasificacion(lector.readLine());
                        break;       
                }
            }   
        }
    } 
    
    public void mostrarAsesor(Asesor x){
            System.out.println( "1.Nombre : " + x.getNombre() );
            System.out.println( "2.Rut : " + x.getRut());
            System.out.println( "3.Mail : " + x.getMail());
            System.out.println( "4.Contraseña : " + x.getPass());
            System.out.println( "5.Disponibilidad : " + x.getDisponibilidad());
            System.out.println( "6.Clasificación : " + x.getClasificacion());
            System.out.println( "0.Salir");
            System.out.println("--------------------------------\n");         
    }
    
    public void modificarVendedor(String rut)throws IOException{
        String sPivot;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int i = buscaPropietario(rut);
        int x=1,y;
        if(i!=0){
            i--;
            Cliente cPivot = vendedores.get(i);
            while(x!=0){
                System.out.println("Favor seleccione el valor a modificar");
                mostrarVendedor(cPivot);
                x = Integer.parseInt(lector.readLine());
                switch(x){
                    case 0:
                        break;
                    case 1:
                        System.out.println("Favor ingrese el nuevo valor.");
                        cPivot.setNombre(lector.readLine());
                        break;
                    case 2:
                        System.out.println("Favor ingrese el nuevo valor.");
                        sPivot=lector.readLine();
                        y=buscaPropietario(sPivot);
                        if(y!= 0){
                            System.out.println("El Rut ingresado ya existe.");
                            break;
                        }else{
                           cPivot.setRut(sPivot);
                           break;
                        }
                    case 3:  
                        System.out.println("Favor ingrese el nuevo valor.");
                        sPivot=lector.readLine();
                        y=buscaPropietario(Integer.parseInt(sPivot));
                        if(y!= 0){
                            System.out.println("El Id ingresado ya existe.");
                            break;
                        }else{
                           cPivot.setId(Integer.parseInt(sPivot));
                           break;
                        }
                    case 4:  
                        System.out.println("Favor ingrese el nuevo valor.");
                        cPivot.setTelefono(Integer.parseInt(lector.readLine()));
                        break;
                    case 5:  
                        System.out.println("Favor ingrese el nuevo valor.");
                        cPivot.setMail(lector.readLine());
                        break;
                    case 6:  
                        System.out.println("Favor ingrese el nuevo valor.");
                        cPivot.setPass(lector.readLine());
                        break;       
                }
            }   
        }    
    }
    
        public void mostrarVendedor(Cliente x){
            System.out.println( "1.Nombre : " + x.getNombre() );
            System.out.println( "2.Rut : " + x.getRut());
            System.out.println( "3.Id : " + x.getId());
            System.out.println( "4.Telefono : " + x.getTelefono());
            System.out.println( "5.Mail : " + x.getMail());
            System.out.println( "6.Contraseña : " + x.getPass());
            System.out.println( "0.Salir");
            System.out.println("--------------------------------\n");         
    }
}