package com.mycompany.inmobiliaria;

import java.io.* ;
import java.util.*;

public class Cliente{
    private String nombreCliente;
    private String rutCliente;
    private int idCliente;
    private int telefono;
    private String mailCliente;
    private String passCliente;
    ArrayList<Propiedades> props;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); 
    
    public Cliente (String nombre, String rut, String id, String telefono, String mail, String pass){
        this.nombreCliente = nombre;
        this.rutCliente = rut;
        this.idCliente = Integer.parseInt(id);
        this.telefono = Integer.parseInt(telefono);
        this.mailCliente = mail;
        this.passCliente = pass;
        props = new ArrayList();
    
    }

    public Cliente(){
       props = new ArrayList();
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

    public void setId(int numero) {
        this.idCliente = numero;
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
    
    public void mostrarPropiedades(){
        if(props.size()==0){
            System.out.println("La lista se encuentra vacia");
        }
        Propiedades pPivot;
        int i = 0 ;
        while(i < props.size()){
            pPivot = props.get(i);
            System.out.println( "Id : " + pPivot.getId() );
            System.out.println( "Precio : " + pPivot.getPrecio());
            System.out.println( "Tamaño : " + pPivot.getMetrosCuadrados() + "Metros cuadrados");
            System.out.println( "Piezas : " + pPivot.getNumPiezas());
            System.out.println( "Telefono : " + pPivot.getNumBanos());
            System.out.println( "Dirección : " + pPivot.getDireccion());
            System.out.println( "Tipo : " + pPivot.getTipo());
            System.out.println( "Piso : " + pPivot.getPiso());
            System.out.println("--------------------------------\n");
            i++;
        }
    }
    
    public void eliminarPropiedad() throws IOException{
        Propiedades pPivot = new Propiedades();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese Id de la Propiedad");
        int id = Integer.parseInt(lector.readLine());
        for(int i = 0; i < props.size(); i++){
            pPivot = props.get(i);
            if(pPivot.getId() == id){
                props.remove(i);
            }
        }
    }
    public int buscarPropiedad(int id){
        if(props.size()==0){
            System.out.println("La lista se encuentra vacia");
            return 0;
        }
        Propiedades pPivot;
        int i= 0;
        boolean verificador = false;
        while(i< props.size()){
            pPivot = props.get(i);
            if(id == pPivot.getId()){
                verificador = true;
                return ( i +1 );
            }else{
                i++;
            }
        }
        if(verificador == false){
            System.out.println("El Id ingresado no pertenece a ninguna propiedad de este vendedor");
        }
        return 0;
        
    }
    //Funciona al igual que las otras versiones de modificar con el loop extra, pero en este caso no se permite la modificacion de la variable ID
    //Esto es debido a que causaria problemas con otros conjuntos de datos, como el mapa de mercado.
    public void modificarPropiedades() throws IOException{
        int x=0,opcion=1,i,y;
        String sPivot;
        Propiedades pPivot;
        while(opcion!=0){
            mostrarPropiedades();
            System.out.println("Favor ingrese el rut del cliente al cual modificar");
            i = buscarPropiedad(Integer.parseInt(lector.readLine()));
            if(i!=0){
                i--;
                pPivot = props.get(i);
                while(x!=0){
                    System.out.println("Favor seleccione el valor a modificar");
                    mostrarPropiedad(pPivot);
                    x = Integer.parseInt(lector.readLine());
                    switch(x){
                        case 0:
                            break;
                        case 1:
                            System.out.println("Favor ingrese el nuevo valor.");
                            pPivot.setPrecio(Integer.parseInt(lector.readLine()));
                            break;
                        case 2:
                            System.out.println("Favor ingrese el nuevo valor.");
                            pPivot.setMetrosCuadrados(Integer.parseInt(lector.readLine()));
                            break;
                        case 3:
                            System.out.println("Favor ingrese el nuevo valor.");
                            pPivot.setNumPiezas(Integer.parseInt(lector.readLine()));
                            break;
                        case 4:  
                            System.out.println("Favor ingrese el nuevo valor.");
                            pPivot.setNumBanos(Integer.parseInt(lector.readLine()));
                            break;
                        case 5:  
                            System.out.println("Favor ingrese el nuevo valor.");
                            pPivot.setDireccion(lector.readLine());
                            break;
                        case 6:  
                            System.out.println("Favor ingrese el nuevo valor.");
                            pPivot.setTipo(lector.readLine());
                            break;
                        case 7:
                            System.out.println("Favor ingrese el nuevo valor.");
                            pPivot.setPiso(Integer.parseInt(lector.readLine()));
                            break;
                    }
                }
            }
            System.out.println("Desea Modificar otra cosa?\n 1.si\n 0.no");
            opcion = Integer.parseInt(lector.readLine());
        }
    }
    
    
    public void mostrarPropiedad(Propiedades x){
            System.out.println( "1.Precio : " + x.getPrecio());
            System.out.println( "2.Tamaño : " + x.getMetrosCuadrados() + "Metros cuadrados");
            System.out.println( "3.Piezas : " + x.getNumPiezas());
            System.out.println( "4.Telefono : " + x.getNumBanos());
            System.out.println( "5.Dirección : " + x.getDireccion());
            System.out.println( "6.Tipo : " + x.getTipo());
            System.out.println( "7.Piso : " + x.getPiso());
            System.out.println( "0.Salir");
            System.out.println("--------------------------------\n");     
    }
} // Fin clase