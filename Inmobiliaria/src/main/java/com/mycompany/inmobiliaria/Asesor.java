package com.mycompany.inmobiliaria;

import java.io.* ;
import java.util.*;

public class Asesor{
    private String nombreAsesor;
    private String rutAsesor;
    private String mailAsesor;
    private String passAsesor;
    private String disponibilidad;
    private String clasificacion;
    private ArrayList<Cliente> aClientes;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    public Asesor() {
        aClientes = new ArrayList();
    }
    
    
    
    
    public Asesor(String nombre, String rut, String mail, String disponibilidad, String clasificacion, String pass){
        this.nombreAsesor = nombre;
        this.rutAsesor = rut;
        this.mailAsesor = mail;
        this.disponibilidad = disponibilidad;
        this.clasificacion = clasificacion;
        this.passAsesor = pass;
        aClientes = new ArrayList();
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
    
    public void mostrarClientes(){
        if(aClientes.size()==0){
            System.out.println("La lista se encuentra vacia");
        }
        Cliente cPivot;
        int i = 0 ;
        while(i < aClientes.size()){
            cPivot = aClientes.get(i);
            System.out.println( "Nombre : " + cPivot.getNombre() );
            System.out.println( "Rut : " + cPivot.getRut());
            System.out.println( "Id : " + cPivot.getId());
            System.out.println( "Contacto : " + cPivot.getMail());
            System.out.println( "Telefono : " + cPivot.getTelefono());
            System.out.println( "Pass : " + cPivot.getPass());
            System.out.println("--------------------------------\n");
            i++;
        }
    }
    //Busca un cliente de un asesor con su rut, retornando su posicion+1 o 0 en caso de no encontrarlo.
    public int buscarCliente(String rut){
        Cliente cPivot;
        int i = 0;
        boolean verificador = false;
        while(i < aClientes.size()){
            cPivot = aClientes.get(i);
            if(rut.equals(cPivot.getRut())){
                verificador = true;
                return ( i + 1 );
            }else{
               i++; 
            }        
        }
        if(verificador == false){
            System.out.println("El rut ingresado no pertenece a ningun Cliente de este Asesor.");
        }
        return 0;
    }
    //Sobrecarga de buscarcliente en este caso con id.
    public int buscarCliente(int id){
        Cliente cPivot;
        int i= 0;
        boolean verificador = false;
        while(i< aClientes.size()){
            cPivot = aClientes.get(i);
            if(id == cPivot.getId()){
                verificador = true;
                return ( i +1 );
            }else{
                i++;
            }
        }
        if(verificador == false){
            System.out.println("El Id ingresado no pertenece a ningun cliente de este asesor");
        }
        return 0;
    }
    
    
    public void eliminarCliente() throws IOException{
        System.out.println("Ingrese Id del Cliente");
        int id = Integer.parseInt(lector.readLine());
        Cliente vPivot = new Cliente();
        for(int i = 0; i < aClientes.size(); i++){
            vPivot = aClientes.get(i);
            if(vPivot.getId() == id){
                aClientes.remove(i);
            }
        }
    }
    //Funciona igual que modificarVendedor en la clase mercado, pero tiene un externo extra, el cual permite cambiar entre diferentes clientes a modificar sin salir del metodo.
    public void modificarClientes() throws IOException{
        int x=0,opcion=1,i,y;
        String sPivot;
        Cliente cPivot;
        while(opcion!=0){
            mostrarClientes();
            System.out.println("Favor ingrese el rut del cliente al cual modificar");
            i = buscarCliente(lector.readLine());
            if(i!=0){
                i--;
                cPivot = aClientes.get(i);
                while(x!=0){
                    System.out.println("Favor seleccione el valor a modificar");
                    mostrarCliente(cPivot);
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
                            y=buscarCliente(sPivot);
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
                            y=buscarCliente(Integer.parseInt(sPivot));
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
            System.out.println("Desea Modificar otra cosa?\n 1.si\n 0.no");
            opcion = Integer.parseInt(lector.readLine());
        }
    }
    
    
    
    public void mostrarCliente(Cliente x){
            System.out.println( "1.Nombre : " + x.getNombre() );
            System.out.println( "2.Rut : " + x.getRut());
            System.out.println( "3.Id : " + x.getId());
            System.out.println( "4.Telefono : " + x.getTelefono());
            System.out.println( "5.Mail : " + x.getMail());
            System.out.println( "6.Contraseña : " + x.getPass());
            System.out.println( "0.Salir");
            System.out.println("--------------------------------\n");     
    }
    
    
    
    
    
} // Fin clase