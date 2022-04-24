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
        
    public int buscaAsesor(String rut){
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
    
    public int buscaPropietario(String rut){
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
    public void agregarAsesor() throws IOException{
        Asesor aPivot = new Asesor();
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
        asesores.add(aPivot);
    }
    
    public void agregarPropiedad(int option) throws IOException{
        Propiedades pPivot = new Propiedades();
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
        pPivot.setId();
        System.out.println("Ingrese los metros cuadrados de la propiedad");
        String metrosCuadrados = lector.readLine();
        pPivot.setMetrosCuadrados(Integer.parseInt(metrosCuadrados));
        mapaPropiedades.put(pPivot.getId(), pPivot);
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
        vendedores.add(cPivot);
    }
    
    public void eliminarVendedor() throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese Id del Vendedor");
        int id = Integer.parseInt(lector.readLine());
        Cliente vPivot = new Cliente();
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
    
}